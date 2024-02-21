public class EcoFilter {
    private User[] filteredUsers;

    public EcoFilter() {
    }

    public User[] ecoUsers(int ecoMax, User[] users) {
        int ecologicalSum = 0;
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            ecologicalSum = users[i].getWaterСount()
                    + users[i].getGasСount1()
                    + users[i].getGasСount2()
                    + users[i].getElectroСount1()
                    + users[i].getElectroСount2();
            if (ecologicalSum < ecoMax) {
                count++;
            }
        }
        filteredUsers = new User[count];
        count = 0;
        for (int j = 0; j < users.length; j++) {
            ecologicalSum = users[j].getWaterСount()
                    + users[j].getGasСount1()
                    + users[j].getGasСount2()
                    + users[j].getElectroСount1()
                    + users[j].getElectroСount2();
            if (ecologicalSum < ecoMax) {
                User user = new User(users[j].getId(),
                        users[j].getName(),
                        users[j].getWaterСount(),
                        users[j].getGasСount1(),
                        users[j].getGasСount2(),
                        users[j].getElectroСount1(),
                        users[j].getElectroСount2());
                filteredUsers[count] = user;
                count++;
            }
            ecologicalSum = 0;
        }
        return filteredUsers;
    }
}
