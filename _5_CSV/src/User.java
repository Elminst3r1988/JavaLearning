public class User {
    private int id;
    private String name;
    private int waterСount;
    private int gasСount1;
    private int gasСount2;
    private int electroСount1;
    private int electroСount2;

    public User(int id, String name, int waterСount, int gasСount1, int gasСount2, int electroСount1, int electroСount2) {
        this.id = id;
        this.name = name;
        this.waterСount = waterСount;
        this.gasСount1 = gasСount1;
        this.gasСount2 = gasСount2;
        this.electroСount1 = electroСount1;
        this.electroСount2 = electroСount2;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWaterСount() {
        return waterСount;
    }

    public int getGasСount1() {
        return gasСount1;
    }

    public int getGasСount2() {
        return gasСount2;
    }

    public int getElectroСount1() {
        return electroСount1;
    }

    public int getElectroСount2() {
        return electroСount2;
    }

}
