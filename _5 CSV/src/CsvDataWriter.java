public class CsvDataWriter {
    private StringBuilder data;
    private int ecologicalSum;
    private String headers;

    public String DataToCSV(User[] users, int ecologicalMax, String header) {
        headers = header;
        data = new StringBuilder();
        data.append(header + "\n");
        for (int i = 0; i < users.length; i++) {
            data.append(users[i].getId())
                    .append(users[i].getName())
                    .append(users[i].getWaterСount())
                    .append(users[i].getGasСount1())
                    .append(users[i].getGasСount2())
                    .append(users[i].getElectroСount1())
                    .append(users[i].getElectroСount2());
        }

        return data.toString();
    }
}
