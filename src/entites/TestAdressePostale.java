package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale adr1 = new AdressePostale();
		adr1.numeroRue  = "12";
		adr1.codePostal = 49480;
		adr1.ville = "Angers";
		adr1.libelleRue = "Rue Hélène Boucher";
				
		AdressePostale adr2 = new AdressePostale();
		adr2.numeroRue  = "15";
		adr2.codePostal = 44100;
		adr2.ville = "Nantes";
		adr2.libelleRue = "Rue Madrid";
		
		System.out.println(adr1.codePostal);
		
	}

}
