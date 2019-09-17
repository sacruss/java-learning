package AggregationAndComposition;

public class Bank {
    public static void main(String[] args) {

        //pierwsza osoba
        Person person1 = new Person();
        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.pesel = "9876251";
        //tworzymy adres
        Address address1 = new Address();
        address1.city = "Lublin";
        address1.postalCode = "20-540";
        address1.street = "Mickiewicza";
        address1.home = 50;
        address1.flat = 27;
        //taki sam adres zamieszkania i zameldowania
        person1.livingAddress = address1;
        person1.registeredAddress = address1;
        //pierwsze konto bankowe
        BankAccount account1 = new BankAccount();
        account1.balance = 10_000;
        account1.owner = person1;

        //druga osoba
        Person person2 = new Person();
        person2.firstName = "Agnieszka";
        person2.lastName = "Maciejko";
        person2.pesel = "6124114";
        person2.registeredAddress = new Address();
        person2.registeredAddress.city = "Kraków";
        person2.registeredAddress.postalCode = "30-555";
        person2.registeredAddress.street = "Dzbenin";
        person2.registeredAddress.home = 7;
        person2.registeredAddress.flat = 6;
        person2.livingAddress = address1;
        //drugie konto bankowe
        BankAccount account2 = new BankAccount();
        account2.owner = person2;
        account2.balance = 5_000;
        System.out.println("Osoba 1:");
        System.out.println(person1.firstName + " " + person1.lastName);
        System.out.println("mieszka w miejscowości: " + person1.livingAddress.city);
        System.out.println("posiada konto bankowe z kwotą: " + account1.balance);

        System.out.println("Osoba 2:");
        System.out.println(person2.firstName + " " + person2.lastName);
        System.out.println("mieszka w miejscowości: " + person2.livingAddress.city);
        System.out.println("posiada konto bankowe z kwotą: " + account2.balance);
    }



//        Credit credit1 = new Credit();
//        credit1.borrower = person1;
//        credit1.cashBorrowed = 5000;
//        credit1.cashReturned = 0;
//        credit1.interestRate = 0.10;
//        credit1.termMonths = 12;

//        System.out.println("Osoba: ");
//        System.out.println(person1.firstName + " " + person1.lastName + " " + person1.pesel);
//        System.out.println("posiada konto bankowe z kwotą: " + account1.balance);
//        System.out.println("oraz kredyt na kwotę " + credit1.cashBorrowed);

    }
