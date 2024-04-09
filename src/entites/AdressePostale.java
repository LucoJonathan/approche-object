package entites;

public class AdressePostale {
	private int codePostal;
	private String numeroRue;
	private String libelleRue;
	private String ville;

	public AdressePostale(String numeroRue, String libelleRue, String ville, int codePostal) {
		this.codePostal = codePostal;
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.ville = ville;
		/*
		 * System.out.println("Vous habitez à : " + this.numeroRue + " " +
		 * this.libelleRue + " " + this.ville + " " + this.codePostal);
		 */
	}

	@Override
	public String toString() {
		return "codePostal=" + codePostal + ", numeroRue=" + numeroRue + ", libelleRue=" + libelleRue
				+ ", ville=" + ville ;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getNumeroRue() {
		return numeroRue;
	}

	public void setNumeroRue(String numeroRue) {
		this.numeroRue = numeroRue;
	}

	public String getLibelleRue() {
		return libelleRue;
	}

	public void setLibelleRue(String libelleRue) {
		this.libelleRue = libelleRue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}
