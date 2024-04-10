package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
	private double[] array = new double[1];
	private int nombreElement = 0;

	public void ajout(double valeur) {
		if (nombreElement < array.length) {
			array[nombreElement] = valeur;
		} else {
			array = Arrays.copyOf(array, array.length + 5);
			array[nombreElement] = valeur;
		}
		nombreElement++;
	}

	public double moyenne() {
		double moyenne = 0;
		for (int i = 0; i < array.length; i++) {
			moyenne = moyenne + array[i];
		}
		moyenne = moyenne / nombreElement + 1;
		return moyenne;
	}
}
