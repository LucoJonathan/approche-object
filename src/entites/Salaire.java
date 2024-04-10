package entites;

public class Salaire {

	private String nom;
	private String prenom;
	private double salaire;
	
	
	
	public Salaire() {
		super();
		
	}
	
	@Override
	public String toString() {
		return "Salaire [nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire + "]";
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

}
