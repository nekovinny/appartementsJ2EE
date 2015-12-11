<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>

<link rel="stylesheet" type="text/css" href="./css/style.css" />
<title> Appartement KAK</title>
<div class="head"> <img src="./img/icone.jpe"> 
<h1> BIENVENUE SUR APPARTEMENT KAK </h1> 
<a href="monCompte.html"> <img src="./img/compteutilisateur.jpe"> Mon Compte </a> </div>

</head>
<body>
<%@ page import ="java.sql.*" %>
<%@ page import ="javax.sql.*" %>
<%
String user=request.getParameter("userid"); 
session.putValue("userid",user); 
String pwd=request.getParameter("pwd"); 
String fname=request.getParameter("fname"); 
String lname=request.getParameter("lname"); 
String email=request.getParameter("email"); 
Class.forName("com.mysql.jdbc.Driver"); 
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",
"root","root"); 
Statement st= con.createStatement(); 
ResultSet rs; 
int i=st.executeUpdate("insert into users values ('"+lname+"','"+fname+"','"+userid+"',	'"+pwd+"','"+phone+"')"); 

out.println("Enrégistré !"); 


%>
<a href ="connexion.html">Connexion</a><br/><br/>
<a href="index.html">Retour à l'accueil</a>
</body>
</html>