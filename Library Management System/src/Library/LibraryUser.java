package Library;

public abstract class LibraryUser {

    private final String name;
    private final String dateOfBirth;
    private final String userID;

    LibraryUser(String name, String dateOfBirth, String userID) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public String getUserID() {
        return userID;
    }

    public abstract String displayUserInfo();
}
