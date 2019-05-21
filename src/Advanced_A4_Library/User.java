package Advanced_A4_Library;

import java.util.ArrayList;

public class User {

    static int counter;

    String userId;
    String userName;
    String userEmail;
    ArrayList<String> usrBooks;

    User ( String userName, String userEmail){
        counter++;
        this.userId = "u" +counter;
        this.userName = userName;
        this.userEmail = userEmail;
        ArrayList<String>usrBooks = new ArrayList<>();
    }
    //adds books to User
    public void setUsrBooks(String bookId){
        usrBooks.add(bookId);
    }

}
