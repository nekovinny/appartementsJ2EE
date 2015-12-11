package model;

public class Agence {
	private static Agence _instance = null; 
	private String nom;	
	private Agence(String _nom) {
		this.nom = _nom;
	} 
	
	public static Agence getInstance () { 

		 if (_instance == null) 
			 _instance = new Agence ("My Agence");
		 return _instance; 

		 }

	public void CalculCa() {
		// TODO implement here
	}
}