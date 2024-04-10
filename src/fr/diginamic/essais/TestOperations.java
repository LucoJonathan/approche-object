package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		double resultat;
		Operations ope = new Operations();

		resultat = ope.calcul(12, 25, '+');
		System.out.println(resultat);
		resultat = ope.calcul(12, 25, '-');
		System.out.println(resultat);
		resultat = ope.calcul(12, 25, '*');
		System.out.println(resultat);
		resultat = ope.calcul(12, 25, '/');
		System.out.println(resultat);
	}

}
