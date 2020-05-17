package Review;

public class Book {
    int page;
    String word;

    public Book(int page, String word) {
        this.page = page;
        this.word = word;
    }

    void LookUp(){
        System.out.println("Please use dictionary");
    }
}
class Dictionary extends Book{
    public Dictionary(int page, String word) {
        super(page, word);
    }
    void Word(){
        System.out.println("This is the word meaning");
    }
}
class BookTest{
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary(350,"hey");
       Book book = dictionary;
       book.LookUp();
       dictionary.Word();
    }
}
