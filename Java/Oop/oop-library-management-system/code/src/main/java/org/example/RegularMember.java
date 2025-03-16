package org.example;

import java.util.List;

public class RegularMember extends Member {

    private static final int BORROWED_BOOKS_LIMITATION = 3;

    public RegularMember(String name, List<Book> borrowedBooks) {
        super(name, borrowedBooks);
    }

    @Override
    public boolean borrowBook(Book book) {
        if (this.borrowedBooks.size() >= BORROWED_BOOKS_LIMITATION) {
            System.out.println("Member Reached Borrowed book limitation of " + BORROWED_BOOKS_LIMITATION + " Books");
            return false;
        }
        if (book.borrow()) {
            this.borrowedBooks.add(book);
            return true;
        }
        return false;
    }

    public String toString() {
        return "(Regular Member) " + super.toString();
    }
}
