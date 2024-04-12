package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureDepartement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path fichier = Paths.get(
				"C:/Users/Jonathan/Documents/workspace-spring-tool-suite-4-4.22.0.RELEASE/approche-object/TP/recensement.csv");
		List<String> liste = Files.readAllLines(fichier);
		ArrayList<Departement> departements = new ArrayList<>();
		List<String> popDepart = new ArrayList<>();
		popDepart.add("Code département;Population Totale");
		liste.remove(0);

		for (String ligne : liste) {
			String[] tokens = ligne.split(";");
			Departement departementVerif = Departement.getDepartement(departements, tokens[2]);
			departementVerif.setPopulation(departementVerif.getPopulation() + Integer.parseInt(tokens[9].trim().replace(" ", "")));
		}

		Path fichierDest = Paths.get(
				"C:/Users/Jonathan/Documents/workspace-spring-tool-suite-4-4.22.0.RELEASE/approche-object/TP/recensement-Departements.csv");
		for (int i = 0 ; i<departements.size() ; i++)
		{
			String texte = departements.get(i).toString();
			popDepart.add(texte);
		}
			
		Files.write(fichierDest, popDepart, StandardCharsets.UTF_8);
	}
}
