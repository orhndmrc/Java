package Sorting_Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private int page;

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
class NameSorting implements Comparator<Book> {
    public int compare(Book b1, Book b2) {
        return b1.getTitle().compareTo(b2.getTitle());
    }
}
class AuthorSorting implements Comparator<Book> {
    public int compare(Book b1, Book b2) {
        return b1.getAuthor().compareTo(b2.getAuthor());
    }
}
class PageSorting implements Comparator<Book> {
    public int compare(Book b1, Book b2) {
        if(b1.getPage()==b2.getPage()){
            return 0;
        }
        else if(b1.getPage()>b2.getPage()){
            return 1;
        }
        else {
            return -1;
        }
    }
}

class BookTest{
    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Notre Domme","Stephen King",500));
        books.add(new Book("Java","Mustafa Duran",400));
        books.add(new Book("Math","Burhan Demirci",700));
        Collections.sort(books, new NameSorting());
        for(Book bk:books){
            System.out.println(bk.getTitle()+"\t"+bk.getAuthor()+"\t"+bk.getPage());
        }
        System.out.println("***********************************************************");

        Collections.sort(books, new AuthorSorting());
        for(Book bk:books){
            System.out.println(bk.getTitle()+"\t"+bk.getAuthor()+"\t"+bk.getPage());
        }
        System.out.println("***********************************************************");

        Collections.sort(books, new PageSorting());
        for(Book bk:books){
            System.out.println(bk.getTitle()+"\t"+bk.getAuthor()+"\t"+bk.getPage());
        }
    }
}
