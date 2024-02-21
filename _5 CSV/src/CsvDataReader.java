import java.io.BufferedReader;
import java.io.IOException;

public class CsvDataReader {
    private String row;
    private User[] users;
    private String[] lines;
    private StringBuilder data;


    public StringBuilder dataCsv(BufferedReader csvReader) throws IOException {
        data = new StringBuilder();
        while ((row = csvReader.readLine()) != null) {
            data.append(row + " ");
        }
        csvReader.close();
        return data;
    }

    public User[] users(StringBuilder data) throws IOException {
        String[] rows = data.toString().split(" ");
        users = new User[rows.length - 1];
        for (int i = 0; i < users.length; i++) {
            lines = rows[i + 1].split("\\|");
            User user = new User(Integer.parseInt(lines[0]),
                    lines[1],
                    Integer.parseInt(lines[2]),
                    Integer.parseInt(lines[3]),
                    Integer.parseInt(lines[4]),
                    Integer.parseInt(lines[5]),
                    Integer.parseInt(lines[6]));
            users[i] = user;
        }
        return users;
    }

    public String headers(StringBuilder data) throws IOException {
        String[] rows = data.toString().split(" ");
        return rows[0];
    }

}
