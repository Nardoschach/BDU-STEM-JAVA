package member;

public class Student extends  Member {
    private static final int QUATA = 5;
    private String studentId;
    private DEPARTMENT department;

    public Student(String firstName, String lastName, String phone, String email, String studentId, DEPARTMENT department) {
        super(firstName, lastName, phone, email, QUATA);
        this.studentId = studentId;
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + " studentId: " + this.studentId + " department: " + this.department;
    }
}
