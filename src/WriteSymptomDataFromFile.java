import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptomDataFromFile implements ISymptomWriter {

    @Override
    public void write(Map<String, Integer> symptomsMap) throws IOException {
        FileWriter writer = new FileWriter("result.out");
        for (Map.Entry<String, Integer> entry : symptomsMap.entrySet()) {
            writer.write(entry.getKey() + " " + entry.getValue() + "\n");
        }
        writer.close();
    }
}