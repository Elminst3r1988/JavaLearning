import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        int ecologicalMax = 300;

        BufferedReader bufferedReader = new BufferedReader(new FileReader(PathConstants.PATH_TO_CSV));

        CSVDataReader csvDataReader = new CSVDataReader();
        StringBuilder csvData = csvDataReader.dataCSV(bufferedReader);

        User[] users = csvDataReader.users(csvData);
        String headers = csvDataReader.headers(csvData);

        EcoFilter ecoFilter = new EcoFilter();

        CSVDataWriter csvDataWriter = new CSVDataWriter();
        String data = csvDataWriter.DataToCSV(ecoFilter.ecoUsers(ecologicalMax, users), ecologicalMax, headers);

        FileWriter fileWriter = new FileWriter(PathConstants.WRITE_PATH_TO_CSV);
        fileWriter.write(data);
        fileWriter.close();
    }
}
