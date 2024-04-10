package fr.diginamic.essais;

import fr.diginamic.salaire.*;

public class TestIntervenant {
	public static void main(String[] args) {
		Intervenant salaire = new Salaire("Luco","Joanthan",1750.30);
		Intervenant pigiste = new Pigiste("Luco","Maxime",23,86);
		
		System.out.println(pigiste.getSalaire());
		System.out.println(salaire.getSalaire());
		
		salaire.afficherDonnes();
		pigiste.afficherDonnes();
		
	}
}
