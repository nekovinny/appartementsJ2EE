package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Employe;
import model.iUtilisateur;

public class main {

	public static void main(String[] args) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:330/appartements", "root", "");
			
			iUtilisateur i = new Employe("login", "nom", "password");

			i.RechercherType("T5", connection);
			
			connection.close();
			
			
		} catch(SQLException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
