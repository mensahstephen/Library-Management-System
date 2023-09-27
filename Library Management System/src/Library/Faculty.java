package Library;

public class Faculty extends LibraryUser {

    private final String department;
    public Faculty(String name, String dateOfBirth, String userID, String department) {
        super(name, dateOfBirth, userID);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String displayUserInfo() {
        return "Faculty: \n" +
                "Name: " + getName() + "\n" +
                "Date Of Birth: " + getDateOfBirth() + "\n" +
                "User ID: " + getUserID() + "\n" +
                "Department: " + getDepartment() + "\n";
    }
}
