import java.io.IOException;

/**
 * * méthode principale qui lit un fichier et le range par ordre alphabétique dans un nouveau fichier
 *
 * @see ISymptomReader
 * @see ReadSymptomDataFromFile
 * @see CounterTreeMap
 * @see ISymptomTreeMap
 * @see ISymptomWriter
 * @see WriteSymptomDataFromFile
 */
public class AnalyticsCounter {

    public static final String SYMPTOMS_TXT = "symptoms.txt";

    public static void main(String args[]) throws Exception {
        AnalyticsCounter countdown = new AnalyticsCounter();
        countdown.generateSymptomsCountdown();
    }

    public void generateSymptomsCountdown() throws IOException {
        ISymptomWriter writer = new WriteSymptomDataFromFile();
        ISymptomReader reader = new ReadSymptomDataFromFile(SYMPTOMS_TXT);
        ISymptomTreeMap map = new CounterTreeMap();

        writer.write(map.symptomsMap(reader.getSymptoms()));
    }
}
