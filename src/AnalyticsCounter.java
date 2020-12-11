import java.io.IOException;

/**
 * * classe qui lit une liste de symptomes et le range par ordre alphabétique dans un nouveau fichier
 *
 * @see ISymptomReader
 * @see ISymptomTreeMap
 * @see ISymptomWriter
 */
public class AnalyticsCounter {

    public static final String SYMPTOMS_TXT = "symptoms.txt";

    public static void main(String args[]) throws Exception {
        AnalyticsCounter countdown = new AnalyticsCounter();
        countdown.generateSymptomsCountdown();
    }

    /**
     * méthode principale lisant un fichier texte "symptoms.txt", l'insert dans une TreeMap puis l'écrit dans un fichier
     * de sortie "result.out"
     */
    public void generateSymptomsCountdown() throws IOException {
        ISymptomReader reader = new ReadSymptomDataFromFile(SYMPTOMS_TXT);
        ISymptomTreeMap map = new CounterTreeMap();
        ISymptomWriter writer = new WriteSymptomDataFromFile();


        writer.write(map.symptomsMap(reader.getSymptoms()));
    }
}
