package Library;

public class Magazine extends LibraryResource {
    private final String issueNumber;
    private final String periodicity;
    public Magazine(String title, int publicationYear, String issueNumber, String periodicity) {
        super(title, publicationYear);
        this.issueNumber = issueNumber;
        this.periodicity = periodicity;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public String getPeriod() {
        return periodicity;
    }

    @Override
    public String getInfo() {
        return "Magazine: \n" +
                "Title: " + getTitle() + "\n" +
                "Publication Year: " + getYear() + "\n" +
                "Issue Number: " + getIssueNumber() + "\n" +
                "Period: " + getPeriod() + "\n";
    }
}
