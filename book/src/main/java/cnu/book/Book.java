package cnu.book;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    private int bookid;
    private String title;
    private String author;
    private String category;
    private double price;
    private int availablecopies;

    public Book() {
    }

    public Book(int bookid, String title, String author,
                String category, double price, int availablecopies) {
        this.bookid = bookid;
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
        this.availablecopies = availablecopies;
    }

    public int getId() {
        return bookid;
    }

    public void setId(int bookid) {
        this.bookid = bookid;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailablecopies() {
        return availablecopies;
    }

    public void setAvailablecopies(int availablecopies) {
        this.availablecopies = availablecopies;
    }

    @Override
    public String toString() {
        return "Book [bookid=" + bookid
                + ", title=" + title
                + ", author=" + author
                + ", category=" + category
                + ", price=" + price
                + ", availablecopies=" + availablecopies
                + "]";
    }
}