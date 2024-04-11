package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path fichier = Paths.get("C:/Users/Jonathan/Documents/workspace-spring-tool-suite-4-4.22.0.RELEASE/approche-object/TP/recensement.csv");
		List<String> liste = Files.readAllLines(fichier);
		ArrayList<Ville> villes = new ArrayList<Ville>();
		
		liste.remove(0);
		for(String ligne: liste)
		{
			String[] tokens = ligne.split(";");
			tokens[9] = tokens[9].replace(" ","");		
			int population = Integer.parseInt(tokens[9]);
			villes.add(new Ville(tokens[6],tokens[2],tokens[1],population));
		}
		Iterator<Ville> iterator = villes.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		ArrayList<Ville> villes25k = villes;
		iterator = villes25k.iterator();
		while(iterator.hasNext())
		{
			Ville suppr = iterator.next();
			int val = suppr.getPopulationTotal();
			if (val <= 25000)
			{
				iterator.remove();
			}
		}
		System.out.println(villes25k.size());
	
	}
}
