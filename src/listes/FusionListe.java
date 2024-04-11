package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FusionListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");

		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");

		List<String> liste3 = new ArrayList<String>();

		Iterator<String> iterator = liste1.iterator();
		while (iterator.hasNext()) {
			String couleur = iterator.next();
			liste3.add(couleur);
		}

		Iterator<String> iterator2 = liste2.iterator();
		while (iterator2.hasNext()) {
			String couleur = iterator2.next();
			liste3.add(couleur);
		}

		System.out.println(liste3.size());
		System.out.println(liste3);

	}

}
