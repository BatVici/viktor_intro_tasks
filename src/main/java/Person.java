public class Person {

    private String name;
    private double wallet;

    public void setWallet(double wallet) {
        this.wallet += wallet;
    }

    public double getWallet() {
        return wallet;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}