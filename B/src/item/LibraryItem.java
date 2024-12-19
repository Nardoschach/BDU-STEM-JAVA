package item;

import java.util.Date;

public abstract class LibraryItem {
    static private int idCounter = 1;
    private int id;
    private String title;
    private String author;
    private String publisher;
    private Date publicationDate;
    private  int quantity;

    LibraryItem(String title, String author, String publisher, Date publicationDate, int quantity){
        this.id = generateId();
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        if (quantity < 0) {
            System.out.println("quantity cannot be negative.");
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    public static int generateId() {
        System.out.println("generate id called");
        System.out.println("id: " + idCounter + "returned");
        return idCounter++;
    }

    public void updateAmount(int amount) {
        if ( (amount + quantity) < 0 ) {
            System.out.println("invalid amount passed");
            return;
        }
        this.quantity += amount;
    }

    public void increamentQuantity() {
        this.quantity++;
    }

    public void decreaseQuantity() {
        this.quantity--;
    }

    public int getQuantity() {
        return  this.quantity;
    }

    @Override
    public String toString() {
        String objectString = "title: "+ this.title + " author: " + this.author + " publisher: "  + this.publisher + " publicationDate: " + this.publicationDate  + " quantity: " + quantity;
        return objectString;
    }
}
