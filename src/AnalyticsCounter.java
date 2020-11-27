
import java.util.*;

public class AnalyticsCounter {

    public static void main(String args[]) throws Exception {

        ISymptomWriter.Write(ISymptomTreeMap.symptomsMap(ISymptomReader.result.GetSymptoms()));

    }
}
