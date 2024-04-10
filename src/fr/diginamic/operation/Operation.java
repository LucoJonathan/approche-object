package fr.diginamic.operation;

public abstract class Operation {
	
	private String dateDeOperation;
	private double montant;
	
	public Operation(String dateDeOperation, double montant) {
		super();
		this.dateDeOperation = dateDeOperation;
		this.montant = montant;
	}

	@Override
	public String toString() {
		return "dateDeOperation=" + dateDeOperation + ", montant=" + montant;
	}
	abstract String getType();

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	
	
}
