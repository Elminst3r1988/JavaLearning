public class CSVDataWriter {
    private StringBuilder checkedData;
    private int ecologicalSum;
    private String headers;

    public String DataToCSV(User[] users, int ecologicalMax, String header) {
        headers = header;
        checkedData = new StringBuilder();
        checkedData.append(header + "\n");
        for (int i = 0; i < users.length; i++) {
            ecologicalSum = users[i].getWaterСount()
                    + users[i].getGasСount1()
                    + users[i].getGasСount2()
                    + users[i].getElectroСount1()
                    + users[i].getElectroСount2();
            if (ecologicalSum < ecologicalMax) {
                checkedData.append(users[i].toString());
            }
            ecologicalSum = 0;
        }
        return checkedData.toString();
    }
}
