package listes;

public class Ville {
	private String nom;
	private int nbHabitant;
	public Ville(String nom, int nbHabitant) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}
		
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
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

	
	@Override
	public boolean equals(Object object)
	{
		if (!(object instanceof Ville))
		{
			return false;
		}
		
		Ville other = (Ville) object;
		if ((this.nbHabitant == other.getNbHabitant())&&(nom.equals(other.getNom())))
		{
			return true;
		}
		return false;
		
	}
	
}
