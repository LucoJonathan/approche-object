package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	private int nombreJour;
	private double montantJour;
	
	public Pigiste(String nom, String prenom ,int nombreJour, double montantJour) {
		super(nom,prenom);
		this.montantJour = montantJour;
		this.nombreJour = nombreJour;
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		double salaire = nombreJour*montantJour;
		return salaire;
	}
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Pigiste";
	}

}
