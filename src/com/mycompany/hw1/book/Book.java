package com.mycompany.hw1.book;


import com.mycompany.hw1.book.Author;

import java.util.Arrays;
import java.util.Objects;

public class Book {

    private String name;
    private Author[] authors;
    private double price;
    int qty = 0;


    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }


    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[" +
                "name='" + name + '\'' +
                ", authors={" + Arrays.toString(authors) +
                "}, price=" + price +
                ", qty=" + qty +
                ']';
    }


    public String getAuthorNames() {
        String names = "";
        for (Author a : authors) {
            names += a.getName() + ", ";
        }
        return names.substring(0, names.length() - 2);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Double.compare(book.getPrice(), getPrice()) == 0 &&
                Objects.equals(getName(), book.getName()) &&
                Arrays.equals(getAuthors(), book.getAuthors());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName(), getPrice(), getQty());
        result = 31 * result + Arrays.hashCode(getAuthors());
        return result;
    }

}
