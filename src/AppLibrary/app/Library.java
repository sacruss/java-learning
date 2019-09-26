package AppLibrary.app;


import AppLibrary.io.DataReader;
import AppLibrary.model.Book;

import javax.xml.crypto.Data;

public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.8";

        Book[] books = new Book[1000];
        DataReader dataReader = new DataReader();

        books[0] = new Book("W pustyni i w puszczy", "Henryk SIenkiewicz", 2010, 296,
                "Greg", "9623424324");

        books[1] = new Book("Java. Efektywne programowanie. Wydanie II", "Joshua Bloch", 2010,
                352, "Helion", "413123123" );

        books[2] = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide", "Bert Bates," +
                " Katherine Sierra",
                2008, 851, "McGraw-Hill Osborne Media");

        System.out.println("Wprowadź nową książkę:");
        books[3]=dataReader.readAndCreateBook();
      //  books[4]=dataReader.readAndCreateBook();
        dataReader.close();


        System.out.println(appName + '\n');
        System.out.println("Książki dostepne w bilbiotece");
        books[0].printInfo();
        books[1].printInfo();
        books[2].printInfo();
        books[3].printInfo();
        //books[4].printInfo();
        System.out.println("System może przechowywać do " + books.length + " książek");
    }
}