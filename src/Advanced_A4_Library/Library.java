package Advanced_A4_Library;

import java.util.ArrayList;

public class Library {
    static int counter;
    String libId;
    ArrayList<String> library;

    Library (ArrayList<String> library){
        counter++;
        this.libId = "l" + counter;
        this.library = library;
    }
    public void rentBook(Book bookId){
        bookId.toString();
        library.remove(bookId);
    }
}
