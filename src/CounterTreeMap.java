import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Création d'une TreeMap à partir de la liste des symptomes lus, le nom du symptome sera la clef
 * le nombre d'apparitions sa valeur
 * La valeur est incrémentée de 1 à chaque itération de la clef
 */
public class CounterTreeMap implements ISymptomTreeMap {
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
