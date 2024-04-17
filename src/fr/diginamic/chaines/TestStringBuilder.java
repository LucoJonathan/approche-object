package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long debut = System.currentTimeMillis();
		//StringBuilder builder = new StringBuilder();
		String chaine= "";
		for(int i = 1; i<100001;i++)
		{
			chaine = chaine+i;
		}
		long fin = System.currentTimeMillis();
		System.out.println("temps écoulé en millisecondes :" + (fin-debut));
	}

}
