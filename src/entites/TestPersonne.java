package entites;
import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personne personne1 = new Personne("Luco","Jonathan");
		AdressePostale adrP1 = new AdressePostale("12", "Rue Hélène Boucher","Angers", 49480);
		Personne personne2 = new Personne("Luco","Jonathan",adrP1);
		
		/*Personne personne1 = new Personne();
		Personne personne2 = new Personne();
		
		personne1.adressePostale = new AdressePostale();
		personne2.adressePostale = new AdressePostale();
		
		
		personne1.nom = "Luco";
		personne1.prenom = "Jonathan";
		personne1.adressePostale.codePostal = 49480;
		personne1.adressePostale.ville = "Angers";
		personne1.adressePostale.numeroRue = "12";
		personne1.adressePostale.libelleRue = "Rue Hélène Boucher";
		
		personne2.nom = "Chesnel";
		personne2.prenom = "Myriam";
		personne2.adressePostale.codePostal = 44100;
		personne2.adressePostale.ville = "Nantes";
		personne2.adressePostale.numeroRue = "15";
		personne2.adressePostale.libelleRue = "Rue Madrid";
		
		System.out.println(personne1);*/
	}

}
