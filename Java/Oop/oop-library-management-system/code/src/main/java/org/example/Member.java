package org.example;

import java.util.List;

public abstract class Member {

    private static int count = 1;

    protected int memberID;
    protected String name;
    protected List<Book> borrowedBooks;

    public Member(String name, List<Book> borrowedBooks) {
        this.memberID = count++;
        this.name = name;
        this.borrowedBooks = borrowedBooks;
    }

    public int getMemberID() {
        return this.memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBorrowedBooks() {
        return this.borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public abstract boolean borrowBook(Book book);

    public void returnBook(Book book) {
        book.returnBook();
        this.borrowedBooks.remove(book);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(toStringWithoutBooks());
        if (this.borrowedBooks.isEmpty()) {
            stringBuilder.append(" (Currently has no borrowed books)");
        } else {
            stringBuilder.append("\nBorrowed the following books:");
            this.borrowedBooks.forEach(book -> stringBuilder.append("\n").append(book));
        }
        return stringBuilder.toString();
    }

    public String toStringWithoutBooks() {
        return "Member ID: " + this.memberID + " Name: " +this.name;
    }

}
