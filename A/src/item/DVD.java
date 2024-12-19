package item;

import java.util.Date;

public class DVD extends LibraryItem {
    private int duration;

    public DVD(String title, String author, String publisher, Date publicationDate, int quantity, int duration) {
        super(title, author, publisher, publicationDate, quantity);
        this.duration = duration;
    }

    @Override
    public String toString() {
        return super.toString() + " duration: " + this.duration;
    }
}
