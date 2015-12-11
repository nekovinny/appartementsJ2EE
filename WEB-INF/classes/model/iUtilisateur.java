package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class iUtilisateur {

	private String nom;
	private String login;
	private String password;
	
	public iUtilisateur( String _nom, String _login, String _password) {
		this.nom = _nom;
		this.login = _login;
		this.password = _password;
	}

	/* méthode permettant de consulter tous les biens disponibles. */
	public  void Consulter(){
		
	}

	public  void RechercherVille(String ville){}
	
	public  void RechercherMontantMax(int montant){}

	/* méthode permettant de rechercher des biens suivant leur type
	 * @param type, le type de l'appartement*/
	public void RechercherType(String type, Connection connection){
		try{
			Statement stmt = connection.createStatement();
			String request = "select * from appartements where type='"+type+"'";
			ResultSet rs = stmt.executeQuery(request);
			while (rs.next())
				System.out.println(rs.getString(1) + " " + rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getString(5));
		
			
		} catch(SQLException e){
			e.printStackTrace();
		} 
	}

	public  void RechercherNumeroA(String numero){}
}