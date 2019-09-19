package Overload;

public class CarShop {
    public static void main(String[] args) {
        Car car1 = new Car(2010, "Audi", "A5", "czarny");
        Car car2 = new Car(2017, "Audi", "A5");
        System.out.println(car1.model + " " + car1.color);
        System.out.println(car2.model + " " + car2.color);

        car2.color = "Czerwony";
        System.out.println(car2.color);

    }
}
