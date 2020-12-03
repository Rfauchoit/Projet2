import java.io.IOException;

public class AnalyticsCounter {

    public static final String SYMPTOMS_TXT = "symptoms.txt";

    public static void main(String args[]) throws Exception {
        AnalyticsCounter countdown = new AnalyticsCounter();
        countdown.generateSymptomsCountdown();
    }

    public void generateSymptomsCountdown() throws IOException {
        ISymptomWriter writer = new WriteSymptomDataFromFile();
        ISymptomReader reader = new ReadSymptomDataFromFile(SYMPTOMS_TXT);
        ISymptomTreeMap symptomsMap = new CounterTreeMap();

        writer.write(CounterTreeMap.symptomsMap(reader.getSymptoms()));
    }
}
