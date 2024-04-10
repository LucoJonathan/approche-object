package fr.diginamic.operation;

public class Credit extends Operation {

	public Credit(String dateDeOperation, double montant) {
		super(dateDeOperation, montant);

	}

	@Override
	public String toString() {
		return "Credit [" + super.toString() + " Type : " + getType() + "]";
	}

	String getType() {
		return "Credit";
	}

}
