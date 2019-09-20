package AppLibrary;

public class Book {
    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    String isbn;

    Book(String title, String author, int releaseDate, int pages, String publisher, String isbn) {
        this(title, author, releaseDate, pages, publisher);
        this.isbn = isbn;
    }

    Book(String title, String author, int releaseDate, int pages, String publisher) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.pages = pages;
        this.publisher = publisher;
    }

    void printInfo() {
        System.out.println("Tytuł książki: " + title + '\n' + "Autor książki: " + author + '\n' + "Rok wydania: " +
                releaseDate + '\n' + "Ilość stron: " + pages + '\n' + "Wydawnictwo: " + publisher + '\n' + "Numer ISBN: "
                + isbn + '\n');
    }

}

