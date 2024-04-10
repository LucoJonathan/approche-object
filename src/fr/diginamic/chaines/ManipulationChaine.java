package fr.diginamic.chaines;

import java.util.Arrays;

import entites.Salaire;

public class ManipulationChaine {
			
	public static void main(String[] args) {
		String chaine = "Durand;Marcel;2 523.5";
		char premierCaractere = chaine.charAt(0);
		String nom;
		/*System.out.println("Premier caractere : " + premierCaractere);
		System.out.println("la longueur est : " + chaine.length());
		System.out.println(chaine.indexOf(';'));
		System.out.println(chaine.substring(0,chaine.indexOf(';')));
		nom = chaine.substring(0,chaine.indexOf(';'));
		System.out.println(nom.toLowerCase());
		System.out.println(nom.toUpperCase());*/
			
		
		String[] chaineCSV = chaine.split(";");
		System.out.println(Arrays.toString(chaineCSV));
		System.out.println(chaineCSV[0]);
		nom = chaineCSV[0];
		String prenom = chaineCSV[1];
		System.out.println(prenom);
		
		Salaire salaire = new Salaire();
		chaineCSV[2] = chaineCSV[2].replace(" ","");
		double sal;
		sal = Double.parseDouble(chaineCSV[2]);
		
		salaire.setNom(nom);
		salaire.setPrenom(prenom);
		salaire.setSalaire(sal);
		
		System.out.println(salaire);
		
	}
}
