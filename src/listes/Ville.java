package listes;

public class Ville {
	private String nom;
	private int nbHabitant;
	public Ville(String nom, int nbHabitant) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}
	public int getNbHabitant() {
		return nbHabitant;
	}
	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}
	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitant=" + nbHabitant + "]";
	}

	
}