package tri;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import fichier.Ville;

public class TestTri {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Path fichier = Paths.get(
				"C:/Users/Jonathan/Documents/workspace-spring-tool-suite-4-4.22.0.RELEASE/approche-object/TP/recensement-Ville-Plus-25K.csv");
		List<String> liste = Files.readAllLines(fichier);
		liste.remove(0);
		ArrayList<Ville> villeTri = new ArrayList<>();
		for (String ligne : liste) {
			String[] tokens = ligne.split(";");
			villeTri.add(new Ville(tokens[0], tokens[1], tokens[2], tokens[3]));
		}

		Collections.sort(villeTri);
		List<String> villeOk = new ArrayList<>();
		for (int i = 0 ; i<villeTri.size() ; i++)
		{
			String texte = villeTri.get(i).toString();
			villeOk.add(texte);
		}
		Path fichierDest = Paths.get(
				"C:/Users/Jonathan/Documents/workspace-spring-tool-suite-4-4.22.0.RELEASE/approche-object/TP/recensement-Ville-Plus-25K-Trie.csv");
		Files.write(fichierDest, villeOk, StandardCharsets.UTF_8);
		
		/*
		 * Path fichier = Paths.get(
		 * "C:/Users/Jonathan/Documents/workspace-spring-tool-suite-4-4.22.0.RELEASE/approche-object/TP/recensement.csv"
		 * ); List<String> liste = Files.readAllLines(fichier); liste.remove(0);
		 */

		/*
		 * ArrayList<Ville> villeTri = new ArrayList<>(); for (String ligne : liste) {
		 * String[] tokens = ligne.split(";"); villeTri.add(new Ville(tokens[6],
		 * tokens[2], tokens[1], tokens[9])); }
		 */

		/*
		 * // Tri par ordre Alphabetique Collections.sort(villeTri); for (Ville ville :
		 * villeTri) { System.out.println(ville); }
		 */

		/*
		 * //Affiche par nb habitant Collections.sort(villeTri); for (Ville ville :
		 * villeTri) { System.out.println(ville); }
		 */

	}

}
