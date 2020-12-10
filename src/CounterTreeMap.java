import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Création d'une Map pour intégrer la liste des symptomes
 */
public class CounterTreeMap implements ISymptomTreeMap {

    @Override
    public Map<String, Integer> symptomsMap(List<String> symptomsList) throws IOException {
        Map<String, Integer> symptoms = new TreeMap<>();
        for (String cle : symptomsList) {
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
