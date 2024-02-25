public class EcoFilter {
    private User[] filteredUsers;

    public EcoFilter() {
    }

    public User[] ecoUsers(int ecoMax, User[] users) {
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getWaterСount() < ecoMax
                    && users[i].getGasСount1() < ecoMax
                    && users[i].getGasСount2() < ecoMax
                    && users[i].getElectroСount1() < ecoMax
                    && users[i].getElectroСount2() < ecoMax)
                count++;
        }
        filteredUsers = new User[count];
        count = 0;
        for (int j = 0; j < users.length; j++) {
            if (users[j].getWaterСount() < ecoMax
                    && users[j].getGasСount1() < ecoMax
                    && users[j].getGasСount2() < ecoMax
                    && users[j].getElectroСount1() < ecoMax
                    && users[j].getElectroСount2() < ecoMax) {
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
        }
        return filteredUsers;
    }
}
