package fr.diginamic.utils;

import fr.diginamic.entites.*;

public class CercleFactory{

	
	public static Cercle getInstance(double rayon)
	{
		Cercle cercle = new Cercle(rayon);
		return cercle;
	}
}
