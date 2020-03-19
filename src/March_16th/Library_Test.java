package March_16th;

public class Library_Test {
    public static void main(String[] args) {
        Library mybook= new Library("Java", "Orhan Demirci", 123456, 120,"in stock", "5/11/2020", "5/29/2020");
        System.out.println(mybook.toString());
        mybook.setTitle("Math");
        mybook.setAuthor("Mustafa Demirci");
        mybook.setISBN(97655444);
        mybook.setPageNum(200);
        mybook.setAvailability("not available");
        mybook.setBorrowdate("6/12/2020");
        mybook.setReturndate("6/24/2020");

        System.out.println(  "Library{" +
                "title='" + mybook.getTitle() + '\'' +
                ", Author='" + mybook.getAuthor()+ '\'' +
                ", ISBN=" + mybook.getISBN() +
                ", PageNum=" + mybook.getPageNum()+
                ", Availability='" + mybook.getAvailability() + '\'' +
                ", Borrowdate='" +mybook.getBorrowdate() + '\'' +
                ", Returndate='" + mybook.getReturndate() + '\'' +
                '}');
    }
}
