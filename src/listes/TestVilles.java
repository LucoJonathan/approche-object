package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestVilles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Ville> ville = new ArrayList<>();
		Collections.addAll(ville, new Ville("Nice", 343000), new Ville("Carcassonne", 47800),
				new Ville("Narbonne", 53400), new Ville("Lyon", 484000), new Ville("Foix", 9700),
				new Ville("Pau", 77200), new Ville("Marseille", 850700), new Ville("Tarbes", 40600));
		int max=0;
		Iterator<Ville> iterator = ville.iterator();
		while (iterator.hasNext()) {
			Ville nombre = new Ville("",0);
			nombre = iterator.next();
			int nb = nombre.getNbHabitant();
			if (nb > max)
			{
				max = nb;
			}
		}
		for (int i = 0 ; i<ville.size();i++)
		{
			Ville nombre = ville.get(i);
			int nb = nombre.getNbHabitant();
			if (nb == max)
			{
				System.out.println("La ville la plus grande est : " + ville.get(i));
			}
		}
		int min = Integer.MAX_VALUE;
		iterator = ville.iterator();
		while (iterator.hasNext()) {
			Ville nombre = iterator.next();
			int nb = nombre.getNbHabitant();
			if (min > nb)
			{
				min = nb;
			}
		}
		System.out.println(ville);
		iterator = ville.iterator();
		while (iterator.hasNext()) {
			Ville nombre = iterator.next();
			int nb = nombre.getNbHabitant();
			if (min == nb)
			{
				iterator.remove();
			}
		}
		System.out.println(ville);
	}

}
