package model;

import java.util.*;

public abstract class iBienImmo {

	private String adresse;

	private double surface;

	private double montant;

	private String id;
	
	
	public iBienImmo(){}

	public iBienImmo(String id, String adresse, double surface, double montant) {
		this.id = id;
		this.adresse = adresse;
		this.surface = surface;
		this.montant = montant;
	}

	private Type type;

	private EtatBienImmo etat;

	public void Ajouter() {
		// TODO implement here
	}

	public void Supprimer() {
		// TODO implement here
	}

	public void vendu() {
		// TODO implement here
	}

	public void nonVendu() {
		// TODO implement here
	}

	public void calculerFrais() {
		// TODO implement here
	}

}