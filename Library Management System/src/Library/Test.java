package Library;


public class Test {
    public static void main(String[] args) {
        // Create library resources
        LibraryResource book = new Book("The Great Gatsby", 1925, "F. Scott Fitzgerald", "978-3-16-148410-0");
        LibraryResource magazine = new Magazine("National Geographic", 2023, "Vol. 245, Issue 3", "Monthly");

        // Create library users
        LibraryUser student = new Student("John Doe", "1998-05-15", "12345", "345");
        LibraryUser faculty = new Faculty("Dr. Smith", "1975-10-20", "Science", "Lassonde");

        // Create library and add resources and users
        Library library = new Library();
        library.addResource(book);
        library.addResource(magazine);
        library.addUser(student);
        library.addUser(faculty);

        // Perform library actions
        library.checkoutResource(student, book);
        library.checkoutResource(faculty, magazine);
        System.out.println("-----------------");

        // Display information
        System.out.println(student.displayUserInfo());
        System.out.println("-----------------");
        System.out.println(faculty.displayUserInfo());
        System.out.println("-----------------");
        System.out.println(library.getResourceInfo(book));
        System.out.println("-----------------");
        System.out.println(library.getUserInfo(student));
    }
}

