package item;

import java.util.Date;

public class Journal extends LibraryItem {
    private String type;

    public Journal(String title, String author, String publisher, Date publicationDate, int quantity, String type) {
        super(title, author, publisher, publicationDate, quantity);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + " type: " + this.type;
    }
}
