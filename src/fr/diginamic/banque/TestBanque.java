package fr.diginamic.banque;

import fr.diginamic.banque.entites.*;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte Utilisateur = new Compte(1112, 1254.10);
		System.out.println(Utilisateur);

		Compte[] array = new Compte[2];
		array[0] = new Compte(99, 180.10);
		array[1] = new CompteTaux(9328, 1176, 0.5);

		for (int i = 0 ; i < array.length ; i++)
		{
			System.out.println(array[i]);
		}
		
	}

}
