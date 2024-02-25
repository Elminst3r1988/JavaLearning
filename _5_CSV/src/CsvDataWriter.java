public class CsvDataWriter {
    private StringBuilder data;
    private String headers;

    public String DataToCSV(User[] users, String header) {
        headers = header;
        data = new StringBuilder();
        data.append(header + "\n");
        for (int i = 0; i < users.length; i++) {
            data.append(users[i].getId())
                    .append("|")
                    .append(users[i].getName())
                    .append("|")
                    .append(users[i].getWaterСount())
                    .append("|")
                    .append(users[i].getGasСount1())
                    .append("|")
                    .append(users[i].getGasСount2())
                    .append("|")
                    .append(users[i].getElectroСount1())
                    .append("|")
                    .append(users[i].getElectroСount2())
                    .append("\n");
        }

        return data.toString();
    }
}
