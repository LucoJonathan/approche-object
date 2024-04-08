package entites;

public class AdressePostale {
	int codePostal;
	String numeroRue;
	String libelleRue;
	String ville;
	public AdressePostale(String numeroRue , String libelleRue, String ville, int codePostal)
	{
		this.codePostal = codePostal;
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.ville = ville;
		System.out.println("Vous habitez à : " + this.numeroRue + " " + this.libelleRue + " " + this.ville + " " + this.codePostal);
	}
}
