package org.example;

public class Book {

    private static int count = 1;

    private int id;
    private String title;
    private String author;
    private int availableCopies;

    public Book(String title, String author, int availableCopies) {
        this.id = count++;
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    public boolean borrow() {
        if (this.availableCopies == 0) {
            System.out.println("Can't borrow book, book " + this.id + " has no available copies");
            return false;
        }
        this.availableCopies--;
        return true;
    }

    public void returnBook() {
        this.availableCopies++;
    }

    @Override
    public String toString() {
        return "(Book) " + "ID: " + this.id + ", Title: " + this.title + ", Author: " +
                this.author + ", Available Copies: " + this.availableCopies;
    }
}
