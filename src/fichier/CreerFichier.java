package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path fichier = Paths.get(
				"C:/Users/Jonathan/Documents/workspace-spring-tool-suite-4-4.22.0.RELEASE/approche-object/TP/recensement.csv");
		List<String> liste = Files.readAllLines(fichier);
		ArrayList<String> liste100 = new ArrayList<>();

		for (int i = 0; i < 101; i++) {
			liste100.add(liste.get(i));
		}
		Path fichierDest = Paths.get(
				"C:/Users/Jonathan/Documents/workspace-spring-tool-suite-4-4.22.0.RELEASE/approche-object/TP/recensement-100-lignes.csv");
		Files.write(fichierDest, liste100, StandardCharsets.UTF_8);

	}

}
