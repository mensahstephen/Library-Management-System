package Library;

public class Student extends LibraryUser {

    private final String studentNumber;

    public Student(String name, String dateOfBirth, String userID, String studentNumber) {
        super(name, dateOfBirth, userID);
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    @Override
    public String displayUserInfo() {
        return "Student: \n" +
                "Name: " + getName() + "\n" +
                "Date Of Birth: " + getDateOfBirth() + "\n" +
                "User ID: " + getUserID() + "\n" +
                "Student Number: " + getStudentNumber() + "\n";
    }
}
