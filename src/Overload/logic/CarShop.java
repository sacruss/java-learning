package Overload.logic;

import Overload.data.Car;

public class CarShop {
    public static void main(String[] args) {
        Car audiA5 = new Car(2010, "Audi", "A5", "czarny");
        Car audiA4 = new Car(2017, "Audi", "A4");
        audiA4.setColor("Czerwony");
        audiA4.setYear(-1000);

        System.out.println(audiA4.getBrand() + " " + audiA4.getModel() + " " + audiA4.getYear() + " " + audiA4.getColor());
        System.out.println(audiA5.getBrand() + " " + audiA5.getModel() + " " + audiA5.getYear() + " " + audiA5.getColor());

        System.out.println(audiA4.getColor());

    }
}
