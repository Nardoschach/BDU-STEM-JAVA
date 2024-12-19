package item;

import java.util.Date;

public class DVD extends LibraryItem implements Reservable {
    private int duration;
    public DVD(String title, String author, String publisher, Date publicationDate, int quantity, int duration) {
        super(title, author, publisher, publicationDate, quantity);
        this.duration = duration;
    }

    @Override
    public void markAsBorrowed() {
        decreaseQuantity();
    }

    @Override
    public void markAsReturned() {
        increamentQuantity();
    }

    @Override
    public boolean checkAvailablity() {
        return getQuantity() > 0;
    }

    @Override
    public String toString() {
        return super.toString() + " duration: " + this.duration;
    }
}
