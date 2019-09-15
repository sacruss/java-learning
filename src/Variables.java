public class Variables {
    public static void main(String[] args) {
        String firstName = "Jan";
        int age  = 25;
        double height = 180.5;
        String lastName = "Kowalski";
        final String pesel = "1234567890";

        System.out.println(firstName + " " + lastName + " ma " + age + " lat");
        System.out.println("Pan " +  lastName + " ma pesel " + pesel);
        System.out.println("Jan ma wzrost 180cm");
        System.out.println("Jeżeli firstName urośnie o 5cm, to będzie miał " + (height + 5) + "cm");

        firstName = "Krzysztof";
        System.out.println("Imię po zmianie " + firstName);

    }
}
