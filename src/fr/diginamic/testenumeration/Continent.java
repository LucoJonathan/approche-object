package fr.diginamic.testenumeration;

public enum Continent {

	AFRIQUE("Afrique"),
	EUROPE("Europe"),
	ASIE("Asie"),
	AMERIQUE("Amerique"),
	OCEANIE("Océanie");
	
	private String libelle;

	private Continent(String libelle) {
		this.libelle = libelle;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	
}
