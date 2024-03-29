package AppLibrary.model;


import AppLibrary.io.DataReader;
import AppLibrary.model.Book;

import javax.xml.crypto.Data;

public class Library {
       private static final int MAX_BOOKS = 1000;
       private Book[] books = new Book[MAX_BOOKS];
       private int booksNumber;

       public void addBook (Book book){
           if(booksNumber<MAX_BOOKS){
               books[booksNumber] = book;
               booksNumber++;
           } else{
               System.out.println("Maksymalna liczba książek została osiągnięta");
           }
    }
    public void printBooks(){
           if(booksNumber == 0){
               System.out.println("Brak książzek w bibliotece");
           }
           for (int i = 0; i<booksNumber; i++){
               books[i].printInfo();
           }
    }
}