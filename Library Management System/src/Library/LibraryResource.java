package Library;

public abstract class LibraryResource {

    private String title;
    private int publicationYear;
    private boolean checkedOut;
    private LibraryUser checkedOutBy;

    LibraryResource(String title, int publicationYear) {
        this.publicationYear = publicationYear;
        this.title = title;
        this.checkedOut = false;
        this.checkedOutBy = null;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return publicationYear;
    }

    public boolean isCheckedOut(){
        return checkedOut;
    }

    public LibraryUser getCheckedOutBy(){
        return checkedOutBy;
    }

    public void checkOut(LibraryUser user){
        if(!checkedOut){
            checkedOut = true;
            checkedOutBy = user;
            System.out.println("Resource '" + title + "' checked out by " + user.getName());
        } else {
            System.out.println("Resource is already checked out.");
        }
    }

    public abstract String getInfo();
}
