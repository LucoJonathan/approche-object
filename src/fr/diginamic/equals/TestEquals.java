package fr.diginamic.equals;

import listes.Ville;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ville ville1 = new Ville ("Angers",2);
		Ville ville2 = new Ville ("Angers",3);
		boolean verif;
		verif = ville1.equals(ville2);
		System.out.println(verif);
	}

}
