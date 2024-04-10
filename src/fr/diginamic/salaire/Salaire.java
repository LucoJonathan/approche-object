package fr.diginamic.salaire;

public class Salaire extends Intervenant {

	private double salaireMensuel;
	
	public Salaire(String nom, String prenom ,double salaireMensuel) {
		super(nom,prenom);
		this.salaireMensuel = salaireMensuel;
	}

	@Override
	public double getSalaire() {
		
		return this.salaireMensuel;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Salaire";
	}

}
