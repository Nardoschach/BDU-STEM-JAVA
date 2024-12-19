package item;

public interface Reservable {
    void markAsBorrowed();
    boolean checkAvailablity();
    void markAsReturned();
}