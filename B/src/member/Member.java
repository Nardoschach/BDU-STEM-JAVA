package member;

public abstract class Member {
    private  static  int idCounter = 1;
    private int id;
    private  String firstName;
    private  String lastName;
    private  String phone;
    private  String email;
    private  int currentQuata;


    Member(String firstName, String lastName, String phone, String email, int currentQuata) {
        this.id = generateId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.currentQuata = currentQuata;
    }

    int generateId() {
        return idCounter++;
    }

    @Override
    public String toString() {
        return  " id: " + this.id + " firstName: " + this.firstName + " lastName: " + this.lastName + " phone: " + this.phone + " email: " + this.email + " currentQuata: " + this.currentQuata ;
    }
}
