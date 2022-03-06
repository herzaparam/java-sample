package sample.data;

public class Avanza implements Car, HasBrand, isMaintenance {

    public int getTire() {
        return 4;
    }
    public void ride() {
        System.out.println("this is Avanza");
    }
    public String getBrand() {
        return "Toyota";
    }
    public boolean isMaintenance() {
        return false;
    }
}
