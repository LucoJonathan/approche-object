package fichier;

import java.util.ArrayList;

public class Departement {

	private String codeDepartement;
	private int population;

	public Departement(String codeDepartement, String population) {
		super();
		this.codeDepartement = codeDepartement;
		this.population = Integer.parseInt(population.trim().replace(" ", ""));
	}

	@Override
	public String toString() {
		return codeDepartement + ";" + population;
	}

	public static Departement getDepartement(ArrayList<Departement> departements, String codeDept) {
		for (Departement departement : departements) {
			if (departement.getCodeDepartement().equals(codeDept)) {
				return departement;
			}

		}
		Departement nouveauDepartement = new Departement(codeDept, "0");
		departements.add(nouveauDepartement);
		return nouveauDepartement;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

}
