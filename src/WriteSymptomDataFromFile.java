import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Création d'un fichier .txt à partir de la TreeMap, ou le nom du symptome (la clé)
 * sera en première position et le nombre (la valeur) en deuxième
 */

public class WriteSymptomDataFromFile implements ISymptomWriter {
    @Override
    public void write(Map<String, Integer> symptomsMap) throws IOException {
        FileWriter writer = new FileWriter("result.out");
        for (Map.Entry<String, Integer> entry : symptomsMap.entrySet()) {
            writer.write(entry.getKey() + " " + entry.getValue() + "\n");
        }
        writer.close();
    }
}