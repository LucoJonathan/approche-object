package fr.diginamic.formes;

public class Cercle extends Forme {

	private double rayon;
	
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		double surface = Math.PI*(rayon*rayon);
		
		return surface;
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		double perimetre = Math.PI*(rayon*2);
		
		return perimetre;
	}

}
