import item.Book;
import item.DVD;
import item.Genere;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("math", "moe", "selam", new Date(1992, 3, 12), 30, Genere.TEXT_BOOK, "bjndj284894");
        Book b2 = new Book("bio", "moe", "selam", new Date(1992, 3, 12), 30, Genere.FICTIONAL, "bjndj284894");


        if (b2.getGenere() == Genere.FICTIONAL) {
            System.out.println("we got a fictional book");
        }
//        System.out.println(b1);
//        System.out.println("book1 avaialablity: " + b1.checkAvailablity());
//
//        System.out.println("book 1 borrowed");
//        b1.markAsBorrowed();
//        System.out.println(b1);
//
//        System.out.println("book 1 returned");
//        b1.markAsReturned();
//        System.out.println(b1);

//        DVD dvd1 = new DVD("bio", "moe", "selam", new Date(1992, 3, 12), 30, 120);
//        System.out.println(dvd1);
//        b1.updateQuantity(-50);
//        System.out.println(b1);

//        System.out.println(b2);
    }
}