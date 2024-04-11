package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> liste = new ArrayList<>();
		Collections.addAll(liste ,-1,5,7,3,-2,4,8,5);
		
		System.out.println(liste);
		System.out.println(liste.size());
		
		Iterator<Integer> iterator = liste.iterator();
		int max = 0;
		while(iterator.hasNext())
		{
			int valeur = iterator.next();
			if (valeur>max)
			{
				max = valeur;
			}
		}
		System.out.println(max);
		iterator = liste.iterator();
		int min = Integer.MAX_VALUE;
		while(iterator.hasNext())
		{
			int valeur = iterator.next();
			if (valeur<min)
			{
				min = valeur;
			}
		}
		iterator = liste.iterator();
		while(iterator.hasNext())
		{
			int valeur = iterator.next();
			if(valeur == min)
			{
				iterator.remove();
			}
		}
		System.out.println(liste);
		
		for(int i=0 ; i<liste.size();i++)
		{
			int valeur = liste.get(i);
			if (valeur<0)
			{
				valeur *=-1;
				liste.set(i, valeur);
			}
		}
		
		System.out.println(liste);
	}

}
