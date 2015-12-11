package model;

public class ProprietaireFactory extends iProprietaireFactory {

	Proprietaire creerProprietaire (String _nom, String _login, String _password, String _num) { 
		return new Proprietaire(_nom, _login, _password, _num); 
	} 

}