package fr.diginamic.operation;

public class Debit extends Operation {

	public Debit(String dateDeOperation, double montant) {
		super(dateDeOperation, montant);
		
	}

	@Override
	public String toString() {
		return "Debit ["+ super.toString() + " Type : " + getType() +"]";
	}


	String getType()
	{
		return "Debit";
	}
	
}
