/*A4: Create Books, Library/ Libraries and LibraryUsers
Create Book object
Create LibraryUser object
Create Create Library object. Connect Books to Library
1st way: "Books are saved as ArrayList in a Library"
2nd way: "Books are saved in a separate HashMap; Library saves only the keys"
Create a renting process: attach a Book (somehow) to LibraryUser. (note: the  renting has a
renting start and renting end date). Discuss possible solution for renting process.
 A Book can be rented for the max of 15 days.
ADVANCED: In this city, you can rent a book from any  of the 3 public libraries, and give it
back to any of the 3 libraries. By the end of the day, a truck is moving the books from one
library to another (to bring back the books where they belong). Create the procedure
(attached to the library) that lists all the books that needs to be moved from LibraryX to LibraryY
(note: you will need to change the Book model;
every book belong to specific library). Discuss solution with the group.
ADVANCED: If a user brings back a book late (after 15 days), the fee of number-of-overdue-days
        x price is due. Create all pending fees for a specific LibraryUser,
        if adults are paying 1,00 EUR per overdue day, and minors 0.50 EUR per overdue day.

Note: create this system in "library" package. To demonstrate the usage of your classes,
        create LibraryDemo class with "main" method*/

package Advanced_A4_Library;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //user creation
        User usr1 = new User("Otto", "otto@anyemail.com");
        User usr2 = new User("Annina", "annina@anyemail.com");
        User usr3 = new User("Simon", "simon@anyemail.com");

        Book book1 = new Book ("Harry Potter I", "J.K. Rowling", "Blooming");
        Book book2 = new Book ("Hänsel und Gretel", "Gebrüder Grimm", "Keine Ahnung");
        Book book3 = new Book ("Harry III", "J.k. Rowling", "Blooming");

        HashMap <String, Book> books = new HashMap<>();
        books.put("b1",book1);
        books.put("b2",book2);
        books.put("b3",book3);

        ArrayList<String> bookLib = new ArrayList<>();
        bookLib.add("b1");
        bookLib.add("b2");

        ArrayList<String> bookLib2 = new ArrayList<>();
        bookLib2.add("b3");

        Library lib1 = new Library(bookLib);
        Library lib2 = new Library(bookLib2);

        rentABook("b1", "u1");
    }

    public static void rentABook(String bookId, String userID){


    }
}
