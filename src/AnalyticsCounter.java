import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class AnalyticsCounter {
    private static int headacheCount;
    private static int rashCount;
    private static int dilPupilCount;
    private static int feverCount;
    private static int dryCount;
    private static int inflammationCount;
    private static int tremorCount;
    private static int stomachCount;
    private static int highBloodCount;
    private static int neckCount;
    private static int coughCount;
    private static int insomniaCount;
    private static int consPupilCount;
    private static int nauseaCount;
    private static int breathCount;
    private static int visionCount;
    private static int lowBloodCount;
    private static int arrhythmiasCount;
    private static int dizzyCount;
    private static int anxietyCount;
    private static int waterCount;

    public static void main(String args[]) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("symptoms.txt"));

        String line = reader.readLine();
        /** Création d'une Hashmap pour stocker les données
         *
         */
        Map<String, Integer> symptoms = new HashMap<>();
        symptoms.put("fever : ", feverCount);
        symptoms.put("dry mouth : ", dryCount);
        symptoms.put("headache : ", headacheCount);
        symptoms.put("rash : ", rashCount);
        symptoms.put("inflammation : ", inflammationCount);
        symptoms.put("tremor : ", tremorCount);
        symptoms.put("stomach pain : ", stomachCount);
        symptoms.put("high blood pressure : ", +highBloodCount);
        symptoms.put("stiff neck : ", +neckCount);
        symptoms.put("cough : ", coughCount);
        symptoms.put("dilated pupils : ", dilPupilCount);
        symptoms.put("insomnia : ", insomniaCount);
        symptoms.put("constricted pupils : ", consPupilCount);
        symptoms.put("nausea : ", nauseaCount);
        symptoms.put("shortness of breath : ", breathCount);
        symptoms.put("blurred vision : ", visionCount);
        symptoms.put("low blood pressure : ", +lowBloodCount);
        symptoms.put("arrhythmias : ", arrhythmiasCount);
        symptoms.put("dizziness : ", dizzyCount);
        symptoms.put("anxiety : ", anxietyCount);
        symptoms.put("water retention : ", waterCount);


        while (line != null) {
            System.out.println("symptom from file: " + line);
            if (line.equals("fever")) {
                feverCount++;
                System.out.println("number of fever: " + feverCount);
            } else if (line.equals("dry mouth")) {
                dryCount++;
                System.out.println("number of dry mouth: " + dryCount);
            } else if (line.equals("headache")) {
                headacheCount++;
                System.out.println("number of headache: " + headacheCount);
            } else if (line.equals("rash")) {
                rashCount++;
                System.out.println("number of rash: " + rashCount);
            } else if (line.equals("inflammation")) {
                inflammationCount++;
                System.out.println("number of inflammation: " + inflammationCount);
            } else if (line.equals("tremor")) {
                tremorCount++;
                System.out.println("number of tremor: " + tremorCount);
            } else if (line.equals("stomach pain")) {
                stomachCount++;
                System.out.println("number of stomach pain: " + stomachCount);
            } else if (line.equals("high blood pressure")) {
                highBloodCount++;
                System.out.println("number of high blood pressure: " + highBloodCount);
            } else if (line.equals("stiff neck")) {
                neckCount++;
                System.out.println("number of stiff neck: " + neckCount);
            } else if (line.equals("cough")) {
                coughCount++;
                System.out.println("number of cough: " + coughCount);
            } else if (line.equals("insomnia")) {
                insomniaCount++;
                System.out.println("number of insomnia: " + insomniaCount);
            } else if (line.equals("constricted pupils")) {
                consPupilCount++;
                System.out.println("number of constricted pupils: " + dryCount);
            } else if (line.equals("nausea")) {
                nauseaCount++;
                System.out.println("number of nausea: " + nauseaCount);
            } else if (line.equals("shortness of breath")) {
                breathCount++;
                System.out.println("number of shortness of breath: " + breathCount);
                line = reader.readLine();
            } else if (line.equals("blurred vision")) {
                visionCount++;
                System.out.println("number of blurred vision: " + visionCount);
            } else if (line.equals("low blood pressure")) {
                lowBloodCount++;
                System.out.println("low blood pressure: " + lowBloodCount);
            } else if (line.equals("arrhythmias")) {
                arrhythmiasCount++;
                System.out.println("number of arrhythmias: " + arrhythmiasCount);
            } else if (line.equals("dialated pupils")) {
                dilPupilCount++;
                System.out.println("number of dilated pupils: " + dilPupilCount);
            } else if (line.equals("dizziness")) {
                dizzyCount++;
                System.out.println("number of dizziness: " + dizzyCount);
            } else if (line.equals("anxiety")) {
                anxietyCount++;
                System.out.println("number of anxiety: " + anxietyCount);
            } else if (line.equals("water retention")) {
                waterCount++;
                System.out.println("number of water retention: " + waterCount);
            }
            line = reader.readLine();

           ISymptomWriter writer = new WriteSymptomDataFromFile();

            writer.write("arrhythmias : " + arrhythmiasCount + "\n");
            writer.write("anxiety : " + anxietyCount + "\n");
            writer.write("blurred vision : " + visionCount + "\n");
            writer.write("constricted pupils : " + consPupilCount + "\n");
            writer.write("cough : " + coughCount + "\n");
            writer.write("dilated pupils : " + dilPupilCount + "\n");
            writer.write("dizziness : " + dizzyCount + "\n");
            writer.write("dry mouth : " + dryCount + "\n");
            writer.write("fever : " + feverCount + "\n");
            writer.write("headache : " + headacheCount + "\n");
            writer.write("high blood pressure : " + +highBloodCount + "\n");
            writer.write("inflammation : " + inflammationCount + "\n");
            writer.write("insomnia : " + insomniaCount + "\n");
            writer.write("low blood pressure : " + +lowBloodCount + "\n");
            writer.write("nausea : " + nauseaCount + "\n");
            writer.write("rash : " + rashCount + "\n");
            writer.write("shortness of breath : " + breathCount + "\n");
            writer.write("stiff neck : " + neckCount + "\n");
            writer.write("stomach pain : " + stomachCount + "\n");
            writer.write("tremor : " + tremorCount + "\n");
            writer.write("water retention : " + waterCount + "\n");
        }
    }
}
