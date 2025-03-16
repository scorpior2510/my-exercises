package org.example;

import java.util.List;
import java.util.Optional;

public class Library {

    private final List<Book> books;
    private final List<Member> members;

    public Library(List<Book> books, List<Member> members) {
        this.books = books;
        this.members = members;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void registerMember(Member member) {
        this.members.add(member);
    }

    public boolean borrowBook(int memberID, int bookID) {

        Member member = this.members
                .stream()
                .filter(curr -> curr.getMemberID() == memberID)
                .findFirst().orElse(null);

        if (member == null) {
            System.out.println("Member ID " + memberID + " does not exist in the system");
            return false;
        }

        Book book = this.books
                .stream()
                .filter(curr -> curr.getId() == bookID)
                .findFirst().orElse(null);

        if (book == null) {
            System.out.println("Book ID " + bookID + " does not exist in the system");
            return false;
        }

        return member.borrowBook(book);
    }

    public void returnBook(int memberID, int bookID) {

        Member member = this.members
                .stream()
                .filter(curr -> curr.getMemberID() == memberID)
                .findFirst().orElse(null);

        if (member == null) {
            System.out.println("Member ID " + memberID + " does not exist in the system");
            return;
        }

        Book book = this.books
                .stream()
                .filter(curr -> curr.getId() == bookID)
                .findFirst().orElse(null);

        if (book == null) {
            System.out.println("Book ID " + bookID + " does not exist in the system");
            return;
        }

        member.returnBook(book);

    }

    public void printLibrary() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(Library)\nMember List:\n");
        this.members.forEach(member -> stringBuilder.append(member).append("\n"));
        stringBuilder.append("\nBook List:\n");
        this.books.forEach(book -> stringBuilder.append(book).append("\n"));
        return stringBuilder.toString();
    }

}
