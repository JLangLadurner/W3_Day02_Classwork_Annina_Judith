package Advanced_A4_Library;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Book {

    static int counter;

    String bookID;
    String title;
    String author;
    String publisher;
    GregorianCalendar rentStart;
    GregorianCalendar rentEnd;
    boolean isRented = false;
    String libID;

    Book (String title, String author, String publisher, String libID){
        counter++;
        this.bookID = "b" + counter;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        GregorianCalendar rentStart = null;
        GregorianCalendar rentEnd = null;
        boolean isRented = setIsRented();
        this.libID = libID;

    }
     public void rentingBook(){
        this.rentStart= (GregorianCalendar) Calendar.getInstance();//actuelles Datum
        this.rentEnd = calcRentDur();
        this.isRented = true;
    }
    public void returningBook(){
        this.isRented = false;
    }
    public void printBooks(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        if(this.isRented == false){
            System.out.printf("%-5s" +  "%-30s" + "%12s%n", this.bookID, this.title, "is not Rented");
        }else
        System.out.printf("%-5s" +  "%-30s" + "%12s%n", this.bookID, this.title, sdf.format(this.rentEnd.getTime()) );
    }

    public GregorianCalendar calcRentDur(){
        if(rentStart != null){
            this.rentEnd = (GregorianCalendar)this.rentStart.clone();
            this.rentEnd.add(GregorianCalendar.DATE, 15);
        }
        return this.rentEnd;
    }
    private boolean setIsRented(){
        if(this.rentStart != null){
            return true;
        }else{
            this.isRented = false;
            return false;
        }
    }
}
