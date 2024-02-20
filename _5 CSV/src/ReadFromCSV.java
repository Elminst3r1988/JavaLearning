import java.io.BufferedReader;
import java.io.IOException;

public class ReadFromCSV {
    private String row;
    StringBuilder data;

    public String[] linesCSV(BufferedReader csvReader) throws IOException {
        data = new StringBuilder();
        while ((row = csvReader.readLine()) != null) {
            data.append(row + " ");
        }
        csvReader.close();
        String[] rows = data.toString().split(" ");
        return rows;
    }
}
