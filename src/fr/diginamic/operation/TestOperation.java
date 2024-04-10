package fr.diginamic.operation;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operation[] tabOpe = new Operation[4];
		double global = 0;

		tabOpe[0] = new Credit("25 Avril 2012", 12.30);
		tabOpe[1] = new Credit("28 Mai 2023", 851.30);

		tabOpe[2] = new Debit("25 Avril 2012", 12.30);
		tabOpe[3] = new Debit("28 Mai 2023", 851.30);

		for (int i = 0 ; i<tabOpe.length ; i++)
		{
			System.out.println(tabOpe[i]);
			if (tabOpe[i].getType() == "Credit")
			{
				global = global + tabOpe[i].getMontant();
			}
			else if (tabOpe[i].getType() == "Debit")
			{
				global = global - tabOpe[i].getMontant();
			}
		}
		
		System.out.println(global);
		
	}
	
}
