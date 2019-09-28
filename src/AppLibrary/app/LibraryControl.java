package AppLibrary.app;

import AppLibrary.io.DataReader;
import AppLibrary.model.Book;
import AppLibrary.model.Library;

public class LibraryControl {
    private final int exit = 0;
    private final int addBook = 1;
    private final int printBooks = 2;

    //zmienna do komunikacji z użytkownikiem
    private DataReader dataReader = new DataReader();

    // "biblioteka" przechowująca dane
    private Library library = new Library();
    /* Głowna metoda programu, pozwalająca na wybór opcji i interakcje */

    public void controlLoop() {
        int option;

        do {
            printOptions();
            option = dataReader.getInt();
            switch (option) {
                case addBook:
                    addBook();
                    break;
                case printBooks:
                    printBooks();
                    break;
                case exit:
                    exit();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji, wprowadź ponownie: ");
            }
        } while (option != exit);
    }

    private void printOptions() {
        System.out.println("Wybierz opcję: ");
        System.out.println(exit + " - wyjście z programu");
        System.out.println(addBook + " - dodanie nowej książki");
        System.out.println(printBooks + " - wyświetl dostępne książki");
    }
    private void addBook(){
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }
    private void printBooks(){
        library.printBooks();
    }
    private void exit(){
        System.out.println("Koniec programu, papa!");
        dataReader.close();
    }
}