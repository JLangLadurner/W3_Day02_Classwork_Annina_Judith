package Advanced_A4_Library;

import java.util.ArrayList;

public class User {

    static int counter;

    private String userId;
    private String userName;
    private String userEmail;
    ArrayList<String> userBooks;

    User ( String userName, String userEmail){
        counter++;
        this.userId = "u" +counter;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userBooks = new ArrayList<>();
    }
    //adds books to User
    public void setHasBooks(String bookID){
        this.userBooks.add(bookID);
    }
    public void setReturnBooks(String bookID){
        this.userBooks.remove("bookID");
    }

}
