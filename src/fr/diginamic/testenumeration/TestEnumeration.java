package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Saison[] saisons = Saison.values();
		for (Saison saison: saisons)
		{
			System.out.println(saison.getLibelle());
		}
		
		Saison ete = Saison.valueOf("ETE");
		System.out.println(ete);
		
		Saison hiver = Saison.valueOf("HIVER");
		System.out.println(hiver.getLibelle());
	}

}
