public class EcoFilter {
    private StringBuilder filteredUsers;

    public EcoFilter() {
    }
    public String ecoUsers(int ecoMax, User[] users) {
        int ecologicalSum = 0;
        filteredUsers = new StringBuilder();
        for (int i = 0; i < users.length; i++) {
            ecologicalSum = users[i].getWaterСount()
                    + users[i].getGasСount1()
                    + users[i].getGasСount2()
                    + users[i].getElectroСount1()
                    + users[i].getElectroСount2();
            if (ecologicalSum < ecoMax) {
                filteredUsers.append(users[i].toString());
            }
            ecologicalSum = 0;
        }
        return filteredUsers.toString();
    }
}
