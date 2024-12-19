package item;

import java.util.Date;

public class Book extends LibraryItem implements Reservable{
    private Genere genere;
    private String isbn;

    public Book(String title, String author, String publisher, Date publicationDate, int quantity, Genere genere, String isbn){
        super(title, author, publisher, publicationDate, quantity);
        this.genere = genere;
        this.isbn = isbn;
    }

    public Genere getGenere() {
        return  genere;
    }

    @Override
    public boolean checkAvailablity() {
//        if (getQuantity() > 0) {
//            return true;
//        } else {
//            return false;
//        }

        return getQuantity() > 0;
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
    public String toString() {
        return super.toString() + " genere: " + this.genere + " ISBN : " + this.isbn;
    }
}
