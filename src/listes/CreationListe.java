package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class CreationListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> liste = new ArrayList<>();
		for(int i=1 ; i < 101;i++)
		{
			liste.add(i);
		}
		System.out.println("Taille de la liste : " + liste.size());
		System.out.println(liste);
	}
}
