package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;

public class Proprietaire extends iUtilisateur {

	private String num;
	private Set<iBienImmo> bienProposes;
	
	public Proprietaire(String _nom, String _login, String _password, String _num) {
		super(_nom, _login, _password);
		this.num = _num;
	}

	@Override
	public void Consulter() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void RechercherVille(String ville) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RechercherMontantMax(int montant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RechercherNumeroA(String numero) {
		// TODO Auto-generated method stub
		
	}

}