package fr.diginamic.formes;

public class Rectangle extends Forme {

	private double longueur;
	private double largeur;

	public Rectangle(double longueur,double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		double surface = longueur*largeur;
		return surface;
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		double perimetre = (longueur+largeur)*2;
		return perimetre;
	}

}
