public class WriteDataCSV {
    private StringBuilder checkedData;
    private int ecologicalSum;
    private String[] headers;

    public String writingData(String[] data, int ecologicalMax) {
        headers = data[0].split(Constants.DELIMETR);
        checkedData = new StringBuilder();
        for (int i = 0; i < headers.length; i++) {
            if (i != headers.length - 1) {
                checkedData.append(headers[i]).append("|");
            } else {
                checkedData.append(headers[i] + "\n");
            }
        }
        for (int i = 1; i < data.length; i++) {
            String[] lines = data[i].split(Constants.DELIMETR);
            ecologicalSum = Integer.parseInt(lines[Constants.WATER_COUNT])
                    + Integer.parseInt(lines[Constants.GAS_COUNT_1])
                    + Integer.parseInt(lines[Constants.GAS_COUNT_2])
                    + Integer.parseInt(lines[Constants.ELECTRO_COUNT_1])
                    + Integer.parseInt(lines[Constants.ELECTRO_COUNT_2]);
            if (ecologicalSum < ecologicalMax) {
                checkedData.append(lines[Constants.ID])
                        .append("|")
                        .append(lines[Constants.NAME])
                        .append("|")
                        .append(lines[Constants.WATER_COUNT])
                        .append("|")
                        .append(lines[Constants.GAS_COUNT_1])
                        .append("|")
                        .append(lines[Constants.GAS_COUNT_2])
                        .append("|")
                        .append(lines[Constants.ELECTRO_COUNT_1])
                        .append("|")
                        .append(lines[Constants.ELECTRO_COUNT_2])
                        .append("\n");
            }
            ecologicalSum = 0;
        }
        return checkedData.toString();
    }
}
