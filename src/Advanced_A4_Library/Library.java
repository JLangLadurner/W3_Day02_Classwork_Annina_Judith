package Advanced_A4_Library;

import java.util.ArrayList;
import java.util.Map;

public class Library {
    static int counter;
    String libId;
    ArrayList<String> libraryBooks;


    Library (ArrayList<String> library){
        counter++;
        this.libId = "l" + counter;
        this.libraryBooks = library;
    }
    public void rentBook(String bookID){
        libraryBooks.remove(bookID);
    }
    public void returnBook(Book bookID){
        String IDOfBook = bookID.toString();
        libraryBooks.add(IDOfBook);
    }
}
