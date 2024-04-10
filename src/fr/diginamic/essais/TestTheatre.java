package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		Theatre ancenis = new Theatre("Ancenis",250);
		
		ancenis.inscrire(246, 10);
		ancenis.inscrire(6, 10);
		System.out.println(ancenis.getRecette()); 
	}

}
