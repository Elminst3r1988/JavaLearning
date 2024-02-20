import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        int ecologicalMax = 750;

        BufferedReader csvReader = new BufferedReader(new FileReader(PathConstants.PATH_TO_CSV));

        ReadFromCSV readFromCSV = new ReadFromCSV();
        String[] rows = readFromCSV.linesCSV(csvReader);

        WriteDataCSV writeDataCSV = new WriteDataCSV();
        String data = writeDataCSV.writingData(rows, ecologicalMax);

        FileWriter fileWriter = new FileWriter(PathConstants.WRITE_PATH_TO_CSV);
        fileWriter.write(data);
        fileWriter.close();
    }
}
