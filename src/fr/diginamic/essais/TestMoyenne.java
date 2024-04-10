package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		CalculMoyenne ope = new CalculMoyenne();
		double moyenne;
		
		ope.ajout(156.3);
		ope.ajout(145.2);
		ope.ajout(15.0);
		moyenne = ope.moyenne();
		System.out.println(moyenne);
	}

}
