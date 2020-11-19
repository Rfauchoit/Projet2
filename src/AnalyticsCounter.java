import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class AnalyticsCounter {

    public static void main(String args[]) throws Exception {

        ReadSymptomDataFromFile result = new ReadSymptomDataFromFile("symptoms.txt");

        List<String> symptomsList = result.GetSymptoms();

/** Création d'une Hashmap pour stocker les données
 *
 */
        Map<String, Integer> symptoms = new HashMap<>();

        for (int idxSymptoms = 0; idxSymptoms < symptomsList.size(); idxSymptoms++) {
            String cle = symptomsList.get(idxSymptoms);
            int ancienneValeur = 0;

            if (symptoms.containsKey(cle)) {
                ancienneValeur = symptoms.get(cle);
            }
            int valeur = ancienneValeur + 1;
            symptoms.put(cle, valeur);
        }

        FileWriter writer = new FileWriter("result.out");
        for (
                Map.Entry<String, Integer> element : symptoms.entrySet()) {
            writer.write(element.getKey() + " : " + element.getValue() + "\n");
        }

        writer.close();

    }
}
