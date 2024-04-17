package fr.diginamic.testenumeration;

public enum Saison {
	
	PRINTEMPS("Printemps",1),
	ETE("Ete",2),
	AUTOMNE("Automne",3),
	HIVER("Hiver",4);

	private String libelle;
	private int nOrdre;
	
	private Saison(String libelle, int nOrdre) {
		this.libelle = libelle;
		this.nOrdre = nOrdre;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getnOrdre() {
		return nOrdre;
	}

	public void setnOrdre(int nOrdre) {
		this.nOrdre = nOrdre;
	}
}
