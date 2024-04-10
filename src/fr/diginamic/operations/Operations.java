package fr.diginamic.operations;

public class Operations {
	
		public double calcul(double a, double b, char operateur)
		{
			double somme = 0;
			if (operateur == '+')
			{
				somme = a + b;
			}else if (operateur == '-')
			{
				somme = a - b;
			}
			else if (operateur == '*')
			{
				somme = a * b;
			}
			else if (operateur == '/')
			{
				somme = a / b;
			}
			return somme;
		}
}
