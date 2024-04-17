package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import listes.Ville;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<VilleContinent> villes = new ArrayList<VilleContinent>();
		Collections.addAll(villes,new VilleContinent("New York",8804190 ,Continent.AMERIQUE),
				new VilleContinent("Paris",2145906 ,Continent.EUROPE),
				new VilleContinent("Pékin",21900000 ,Continent.ASIE),
				new VilleContinent("Moscou",13100000 ,Continent.EUROPE),
				new VilleContinent("Berlin",3600000 ,Continent.EUROPE),
				new VilleContinent("Sydney",5000000 ,Continent.OCEANIE),
				new VilleContinent("Sao Paulo",12300000 ,Continent.AMERIQUE),
				new VilleContinent("Dakar",3896564 ,Continent.AFRIQUE));
		
		Iterator<VilleContinent> iterator = villes.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
