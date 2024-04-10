package fr.diginamic;
import fr.diginamic.entites.*;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		Cercle a = new Cercle(5);
		Cercle b = new Cercle(2);

		System.out.println(a);
		System.out.println(b);
		
		Cercle d = CercleFactory.getInstance(9);
	}

}
