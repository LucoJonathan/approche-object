package fr.diginamic.testenumeration;


public class VilleContinent {
	private String nom;
	private int nbHabitant;
	private Continent continent;
	public VilleContinent(String nom, int nbHabitant,Continent continent) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.continent = continent;
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
	
	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitant=" + nbHabitant + "continent = "+ continent +"]";
	}

	
	@Override
	public boolean equals(Object object)
	{
		if (!(object instanceof VilleContinent))
		{
			return false;
		}
		
		VilleContinent other = (VilleContinent) object;
		if ((this.nbHabitant == other.getNbHabitant())&&(nom.equals(other.getNom())))
		{
			return true;
		}
		return false;
		
	}
	
}

