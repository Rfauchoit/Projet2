import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Création d'une TreeMap à partir de la liste des symptomes lus, le nom du symptome sera la clef
 * le nombre d'apparitions sa valeur
 * La valeur est incrémentée de 1 à chaque itération de la clef
 * La TreeMap permet de ranger les clefs par ordre alphabétique
 */
public interface ISymptomTreeMap {

  Map<String, Integer>symptomsMap(List<String> symptomsList)throws IOException;

}