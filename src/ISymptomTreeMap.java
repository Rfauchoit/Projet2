import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public interface ISymptomTreeMap {

    static Map<String, Integer> symptomsMap(List<String> symptomsList) {
        Map<String, Integer> symptoms = new TreeMap<>();

        for (
                int idxSymptoms = 0; idxSymptoms < symptomsList.size(); idxSymptoms++) {
            String cle = symptomsList.get(idxSymptoms);
            int ancienneValeur = 0;

            if (symptoms.containsKey(cle)) {
                ancienneValeur = symptoms.get(cle);
            }
            int valeur = ancienneValeur + 1;
            symptoms.put(cle, valeur);
        }
        return symptoms;
    }
}