package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path fichier = Paths.get(
				"C:/Users/Jonathan/Documents/workspace-spring-tool-suite-4-4.22.0.RELEASE/approche-object/TP/recensement.csv");
		List<String> liste = Files.readAllLines(fichier);
		ArrayList<Ville> villes = new ArrayList<>();

		liste.remove(0);
		for (String ligne : liste) {
			String[] tokens = ligne.split(";");
			villes.add(new Ville(tokens[6], tokens[2], tokens[1], tokens[9]));
		}
		Iterator<Ville> iterator = villes.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		ArrayList<Ville> villes25k = villes;
		iterator = villes25k.iterator();
		while (iterator.hasNext()) {
			Ville suppr = iterator.next();
			int val = suppr.getPopulationTotal();
			if (val <= 25000) {
				iterator.remove();
			}
		}
		System.out.println(villes25k.size());
		Path fichierDest = Paths.get(
				"C:/Users/Jonathan/Documents/workspace-spring-tool-suite-4-4.22.0.RELEASE/approche-object/TP/recensement-Ville-Plus-25K.csv");
		List<String> liste25k = new ArrayList<>();
		for (int i = 0 ; i<villes25k.size() ; i++)
		{
			String texte = villes25k.get(i).toString();
			liste25k.add(texte);
		}
			
		Files.write(fichierDest, liste25k, StandardCharsets.UTF_8);
	}
}
