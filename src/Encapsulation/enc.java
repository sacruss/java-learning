package Encapsulation;

public class enc {
    public static void main(String[] args) {
//        String firstName = "Jan";
//        String lastName = "Kowalski";
//        boolean clientPremium = true;
//        double price = 1100;
//        double discountPrice = price;
//        if (clientPremium && price > 1000) {
//            discountPrice *= 0.85;
//        } else if (price > 1000) {
//            discountPrice *= 0.9;
//        } else if (clientPremium) {
//            discountPrice *= 0.95;
//        }
//        System.out.println("Witaj " + firstName + " " + lastName);
//        System.out.println("Kwota przed rabatem: " + price);
//        System.out.println("Do zapłaty (po rabacie): " + discountPrice);

        Client client1 = new Client(null, "Kowalski", true);
        double price1 = 1110;

        Client client2 = new Client("Karol", "Nowak", false);
        double price2 = 1100;

        DiscountService discountService = new DiscountService();
        double priceDiscount1 = discountService.calculateDiscountPrice(client1,price1);
        double priceDiscount2 = discountService.calculateDiscountPrice(client2,price2);

        printInfo printinfo = new printInfo();
        printInfo.printSummary(client1,price1, priceDiscount1);
        printInfo.printSummary(client2,price2, priceDiscount2);
}
}
