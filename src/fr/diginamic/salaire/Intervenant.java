package fr.diginamic.salaire;

public abstract class Intervenant {
	private String nom;
	private String prenom;
	
	public Intervenant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	public abstract double getSalaire();
	public abstract String getType();
	public void afficherDonnes()
	{
		System.out.println(this.getType() + " " +  nom + " "+prenom+" "+ this.getSalaire());
	}
}
