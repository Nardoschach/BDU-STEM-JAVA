package item;

import java.util.Date;

public abstract class LibraryItem {
    static  private int idCounter = 1;
    private int id;
    private String title;
    private String author;
    private String publisher;
    private Date publicationDate;
    private  int quantity;

    LibraryItem(String title, String author, String publisher, Date publicationDate, int quantity){
        // TODO check input
        this.id = generateId();
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        if (quantity < 0) {
            System.out.println("quantity cannot be negative.");
            quantity = 0;
        } else {
            this.quantity = quantity;
        }

    }

    public int getQuantity() {
        return quantity;
    }


    public void decreaseQuantity() {
        if (quantity <= 0) {
            System.out.println("item quantity cannot be decreased");
        } else {
            quantity--;
        }
    }

    public void increamentQuantity() {
        quantity++;
    }


    public void updateQuantity(int amount) {
        if ( (quantity + amount) < 0 ) {
            System.out.println("The amount passed is invalid");
        } else {
            quantity += amount;
        }
    }

    public static int generateId() {
        return idCounter++;
    }

    @Override
    public String toString() {
        return (" id: " + id +  " title: " + title + " author: " + this.author + " publisher " + this.publisher + " publication date: " + this.publicationDate.toString() + " quantity : " + this.quantity);
    }
}
