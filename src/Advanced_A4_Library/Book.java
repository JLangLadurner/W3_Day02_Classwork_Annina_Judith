package Advanced_A4_Library;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Book {

    static int counter;

    String bookId;
    String title;
    String author;
    String publisher;
    GregorianCalendar rentStart;
    GregorianCalendar rentEnd;
    private Status aStatus;
    public enum Status {
       Available,
       notAvailable
    }

    Book (String title, String author, String publisher, Status aStatus){
        counter++;
        this.bookId = "b" + counter;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        GregorianCalendar rentStart = null;
        GregorianCalendar rentEnd = null;
        this.aStatus = aStatus;
    }

    public void rentAbook(String bookId){
        this.rentStart= (GregorianCalendar) Calendar.getInstance();//actuelles Datum
        this.rentEnd = calcRentDur();
    }

    public GregorianCalendar calcRentDur(){
        if(rentStart != null){
            this.rentEnd = (GregorianCalendar)this.rentStart.clone();
            this.rentEnd.add(GregorianCalendar.DATE, 15);
        }
        return this.rentEnd;
    }
}
