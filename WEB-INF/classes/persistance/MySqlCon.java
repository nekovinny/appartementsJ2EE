package persistance;

import java.sql.*;
public class MySqlCon {

	public static void Enregistrement (String proprietaire) {
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			String connectionUrl = "jdbc:mysql://localhost/appartementsJ2EE";
			Connection con = DriverManager.getConnection(connectionUrl);
					
					
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/appartementsJ2EE","root","");
			System.out.println("GOOD");
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery("select * from proprietaire");
			while (rs.next())
				System.out.println(rs.getInt(1) + " " + rs.getString(2)+""+rs.getString(3));
			connect.close();
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
	}

	
	
	
}
