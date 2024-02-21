public class CSVDataWriter {
    private StringBuilder Data;
    private int ecologicalSum;
    private String headers;

    public String DataToCSV(String users, int ecologicalMax, String header) {
        headers = header;
        Data = new StringBuilder();
        Data.append(header + "\n");
        Data.append(users);
        return Data.toString();
    }
}
