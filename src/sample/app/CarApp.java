package sample.app;

import sample.data.Avanza;

public class CarApp {
    public static void main(String[] args) {

        Avanza avanza = new Avanza();
        System.out.println(avanza.getTire());
        avanza.ride();
        System.out.println(avanza.getBrand());
        System.out.println(avanza.isMaintenance());
    }
}
