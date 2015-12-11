<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>

<link rel="stylesheet" type="text/css" href="./css/style.css" />
<title>Connexion jsp</title>
<div class="head"> <img src="./img/icone.jpe"> 
<h1> BIENVENUE SUR APPARTEMENT KAK </h1> 
<a href="monCompte.html"> <img src="./img/compteutilisateur.jpe"> Mon Compte </a> </div>

</head>
<body>
	<%@ page import="java.sql.*"%>
	<%@ page import="javax.sql.*"%>
	<%
String userid=request.getParameter("usr"); 
session.putValue("userid",userid); 
String pwd=request.getParameter("pwd"); 
Class.forName("com.mysql.jdbc.Driver"); 
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root"); 
Statement st= con.createStatement(); 
ResultSet rs=st.executeQuery("select * from users where userid='"+userid+"'"); 
if(rs.next()) 
{ 
if(rs.getString(2).equals(pwd)) 
{ 
out.println("BIENVENUE"+userid); 

} 
else 
{ 
out.println("Mot de passe invalide . Veuillez réessayer"); 
} 
} 
else 
%>
<a href="index.html">Retour à l'accueil</a>
</body>
</html>