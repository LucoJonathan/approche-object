package fr.diginamic.entites;

public class Theatre {
	
	private String nom;
	private int capaciteMax;
	private int totalClientsInscrits;
	private double recette;
	
	public Theatre(String nom, int capaciteMax) {
		super();
		this.capaciteMax = capaciteMax;
		this.nom = nom;
	}

	public void inscrire(int nombreClients, double prixPlace)
	{
		if ((totalClientsInscrits >= capaciteMax)||((nombreClients + totalClientsInscrits) >= capaciteMax))
		{
			System.out.println("Il y a trop de clients pour la capacité max!!!");	
		}else if(((totalClientsInscrits < capaciteMax)||(nombreClients < capaciteMax)))
		{
			int nombreRest = 0;
			totalClientsInscrits = totalClientsInscrits + nombreClients;
			recette = recette + (prixPlace*nombreClients);
			nombreRest = capaciteMax - totalClientsInscrits;
			System.out.println("Il reste : "+ nombreRest + "place(s)");
		}
	}

	public double getRecette() {
		return recette;
	}
	
	
	
}
