package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> liste = new ArrayList<>();
		Collections.addAll(liste, "Nice","Carcassonne","Narbonne","Lyon","Foix","Pau","Marseille","Tarbes");
		Iterator<String> iterator = liste.iterator();
		int maxCa=0;
		while(iterator.hasNext())
		{
			String string =iterator.next();
			int nbC = string.length();
			if (nbC > maxCa)
			{
				maxCa = nbC;
			}
		}
		
		for(int i=0;i<liste.size();i++)
		{
			if (liste.get(i).length() == maxCa)
			{
				System.out.println("La ville la plus grande est : " + liste.get(i));
			}
		}
		
		for (int i=0;i<liste.size();i++)
		{
			String val = liste.get(i);
			val = val.toUpperCase();
			liste.set(i, val);
		}
		System.out.println(liste);
		
		iterator = liste.iterator();
		while(iterator.hasNext())
		{
			String ville = iterator.next();
			if(ville.startsWith("N"))
			{
				iterator.remove();
			}
		}
		System.out.println(liste);
	}

}
