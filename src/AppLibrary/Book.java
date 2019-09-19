package AppLibrary;

public class Book {
    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    String isbn;

    Book(String bookTitle, String bookAuthor, int bookReleaseDate, int bookPages, String bookPublisher, String bookIsbn) {
        title = bookTitle;
        author = bookAuthor;
        releaseDate = bookReleaseDate;
        pages = bookPages;
        publisher = bookPublisher;
        isbn = bookIsbn;
    }

    void printInfo() {
        System.out.println("Tytuł książki: " + title + '\n' + "Autor książki: " + author + '\n' + "Rok wydania: " +
                releaseDate + '\n' + "Ilość stron: " + pages + '\n' + "Wydawnictwo: " + publisher + '\n' + "Numer ISBN: "
                + isbn + '\n');
    }
}
