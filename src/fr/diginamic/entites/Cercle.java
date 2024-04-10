package fr.diginamic.entites;

public class Cercle {

	private double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	
	
	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + ", surface()=" + surface() + ", perimetre()=" + perimetre() + "]";
	}



	double surface()
	{
		double surface;
		surface = (rayon*rayon)* 3.14;
		return surface;
	}

	double perimetre() {
		double perimetre = 0;
		perimetre = (2 * rayon) * 3.14;
		return perimetre;
	}

}
