package entites2;

import java.util.Scanner;
import entites.AdressePostale;

public class Personne {
	private String nom, prenom;
	private AdressePostale adressePostale, modAdressePostale;
	Scanner scanner = new Scanner(System.in);
	String inserUtil;

	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(String nom, String prenom, AdressePostale adressePostale) {
		this.nom = nom;
		this.prenom = prenom;
		this.adressePostale = adressePostale;
	}
	
	public String getNom() {
		return this.nom;
	}

	public String getPrenom() {
		return this.prenom;
	}
	
	public AdressePostale getAdresse() {
		return this.adressePostale;
	}
	public void AfficherNomPrenom() {
		System.out.println(this.nom.toUpperCase() + " " + this.prenom.toUpperCase());
	}

	public void ModifierNom() {
		System.out.println("Veuillez modifier votre nom");
		inserUtil = scanner.next();
		nom = inserUtil;
		AfficherNomPrenom();

	}

	public void ModifierPrenom() {
		System.out.println("Veuillez modifier votre Prenom");
		inserUtil = scanner.next();
		prenom = inserUtil;
		AfficherNomPrenom();

	}

	public void ModifierAdressePostale() {
		String modNRue, modVille, modLib;
		int modCodePo;
		System.out.println("Veuillez modifier votre Adresse Postale");
		System.out.println("Modifier le numero de rue");
		modNRue = scanner.next();
		System.out.println("Modifier le libelle de la rue");
		modLib = scanner.next();
		System.out.println("Modifier le nom de la ville");
		modVille = scanner.next();
		System.out.println("Modifier le code postal");
		modCodePo = scanner.nextInt();
		this.adressePostale = modAdressePostale;

	}

}
