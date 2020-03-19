package March_16th;

public class Library {
    private String title;
    private String Author;
    private int ISBN;
    private int PageNum;
    private String Availability;
    private String Borrowdate;
    private String Returndate;
    public Library(String title, String Author, int ISBN, int PageNum, String Availability, String Borrowdate, String Returndate){
        this.title=title;
        this.Author=Author;
        this.ISBN=ISBN;
        this.PageNum=PageNum;
        this.Availability=Availability;
        this.Borrowdate=Borrowdate;
        this.Returndate=Returndate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getPageNum() {
        return PageNum;
    }

    public void setPageNum(int pageNum) {
        PageNum = pageNum;
    }

    public String getAvailability() {
        return Availability;
    }

    public void setAvailability(String availability) {
        Availability = availability;
    }

    public String getBorrowdate() {
        return Borrowdate;
    }

    public void setBorrowdate(String borrowdate) {
        Borrowdate = borrowdate;
    }

    public String getReturndate() {
        return Returndate;
    }

    public void setReturndate(String returndate) {
        Returndate = returndate;
    }

    @Override
    public String toString() {
        return "Library{" +
                "title='" + title + '\'' +
                ", Author='" + Author + '\'' +
                ", ISBN=" + ISBN +
                ", PageNum=" + PageNum +
                ", Availability='" + Availability + '\'' +
                ", Borrowdate='" + Borrowdate + '\'' +
                ", Returndate='" + Returndate + '\'' +
                '}';
    }
}
