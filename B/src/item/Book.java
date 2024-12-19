package item;

import java.util.Date;

public class Book extends LibraryItem implements Reservable {
    private Genere genere;
    private String isbn;

    public Book(String title, String author, String publisher, Date publicationDate, int quantity, Genere genere, String isbn) {
        super(title, author, publisher, publicationDate, quantity);
        this.genere = genere;
        this.isbn = isbn;
    }

    public Genere getGenere() {
        return this.genere;
    }

    @Override
    public String toString() {
        String bookString = super.toString() + " genere: " + this.genere + " isbn: " + this.isbn;
        return bookString;
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
}
