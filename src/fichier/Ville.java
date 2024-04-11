package fichier;

public class Ville {
	private String nom;
	private String codeDepartement;
	private String nomRegion;
	private int populationTotal;

	public Ville(String nom, String codeDepartement, String nomRegion, String populationTotal) {
		super();
		this.nom = nom;
		this.codeDepartement = codeDepartement;
		this.nomRegion = nomRegion;
		this.populationTotal = Integer.parseInt(populationTotal.trim().replace(" ", ""));
	}

	public String getNom() {
		return nom;
	}

	@Override
	public String toString() {
		return nom + ";" + codeDepartement + ";" + nomRegion
				+ ";" + populationTotal;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public int getPopulationTotal() {
		return populationTotal;
	}

	public void setPopulationTotal(String populationTotal) {
		this.populationTotal = Integer.parseInt(populationTotal.trim().replace(" ", ""));
	}

}
