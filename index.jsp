<%@page language="java" contentType="text/html"; charset="ISO-88591"%>
<%@ page import = "java.sql.*"%>
<body>

	<%@

	Class.forName("com.mysql.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:330/appartements", "root", "");
	Statement stmt = connection.createStatement();
	String query = "select * from appartements";
	ResultSet res = stmt.executeQuery(query);

	while(rs.next())
		System.out.println(rs.getString(1) + " " + rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getString(5));

	connection.close();
	%>
	
</body>