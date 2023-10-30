package ITMO.JavaBasics.Task2;

import java.util.Date;

public class Book {
    private String title;
    private String author;
    private String publishingCompany;
    private int yearPublication;
    private double price;

    public Book() {
    }

    private Book(String title, String author, String pubCom, int yearPub, double price) {
        this.title = title;
        this.author = author;
        this.publishingCompany = pubCom;
        this.yearPublication = yearPub;
        this.price = price;
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

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        if (yearPublication > 0) {
            this.yearPublication = yearPublication;
        } else {
            System.out.println("Некорретный год издания");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (yearPublication > 0) {
            this.price = price;
        } else {
            System.out.println("Некорретная цена");
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", yearPublication=" + yearPublication +
                ", price=" + price +
                '}';
    }
}

