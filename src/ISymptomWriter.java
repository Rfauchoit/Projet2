import java.io.IOException;
import java.util.Map;

/**
 * Création d'un fichier .txt à partir de la TreeMap, ou le nom du symptome (la clé)
 * sera en première position et le nombre (la valeur) en deuxième
 */
public interface ISymptomWriter {

    void write(Map<String, Integer> symptomsMap) throws IOException;
}
