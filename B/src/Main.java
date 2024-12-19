import item.Book;
import item.DVD;
import item.Genere;
import item.Journal;
import member.DEPARTMENT;
import member.Student;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("abc", "t","969696969", "jkdjf@email.com", "BDU78956", DEPARTMENT.computer_science);
        System.out.println(s1);






//        Book b1 = new Book("math", "moe", "selam", new Date(1992, 3, 12), 30, Genere.TextBook, "234355r3535");
//        Book b2 = new Book("bio", "moe", "selam", new Date(1992, 3, 12), 30, Genere.TextBook, "234355r3535467");
//
//        if (b1.getGenere().equals(Genere.TextBook)) {
//            System.out.println("we got a text book");
//        }

        //
//        System.out.println(b1);
//        System.out.println("b1 avaialble" + b1.checkAvailablity());
//        System.out.println("b2 avaialble" + b2.checkAvailablity());
//        b1.markAsBorrowed();
//        b2.markAsBorrowed();
//        System.out.println(b1);
//        System.out.println(b2);
//        b1.markAsReturned();
//        b2.markAsReturned();
//        System.out.println(b1);
//        System.out.println(b2);

//        b1.updateAmount(-40);
//        System.out.println(b1);

//        DVD dvd1 = new DVD("math", "moe", "selam", new Date(1992, 3, 12), 30, 120);
//        System.out.println(dvd1);

//        Journal journal1 = new Journal("math", "moe", "selam", new Date(1992, 3, 12), 30, "entertainment");
//        System.out.println(journal1);
    }

}