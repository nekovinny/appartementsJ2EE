package model;

import java.sql.Statement;
import java.util.*;

public class Employe extends iUtilisateur {
	
	String login, nom, password;
	
	public Employe(String login, String nom, String password){
		super(nom, login, password);
	}

	private Set<Vendu> appartVendu;

	public void saisirInfosVente(double montant, Date date) {
		// TODO implement here
	}

	/*Afficher la liste des appartements*/
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