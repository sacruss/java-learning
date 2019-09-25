package AppLibrary.app;


import AppLibrary.model.Book;

public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.7";

        Book[] books = new Book[1000];

        books[0] = new Book("W pustyni i w puszczy", "Henryk SIenkiewicz", 2010, 296,
                "Greg", "9623424324");

        books[1] = new Book("Java. Efektywne programowanie. Wydanie II", "Joshua Bloch", 2010,
                352, "Helion", "413123123" );

        books[2] = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide", "Bert Bates," +
                " Katherine Sierra",
                2008, 851, "McGraw-Hill Osborne Media");


        System.out.println(appName + '\n');
        System.out.println("Książki dostepne w bilbiotece");
        books[0].printInfo();
        books[1].printInfo();
        books[2].printInfo();
        System.out.println("System może przechowywać do " + books.length + " książek");
    }
}