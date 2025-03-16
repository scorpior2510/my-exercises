package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LibraryFactory {

    private static int bookNum;
    private static final String[][] bookArchive = {
        {"To Kill a Mockingbird", "Harper Lee"},
        {"1984", "George Orwell"},
        {"Pride and Prejudice", "Jane Austen"},
        {"The Great Gatsby", "F. Scott Fitzgerald"},
        {"Moby-Dick", "Herman Melville"},
        {"War and Peace", "Leo Tolstoy"},
        {"The Catcher in the Rye", "J.D. Salinger"},
        {"Crime and Punishment", "Fyodor Dostoevsky"},
        {"Brave New World", "Aldous Huxley"},
        {"The Lord of the Rings", "J.R.R. Tolkien"},
        {"Jane Eyre", "Charlotte Brontë"},
        {"Wuthering Heights", "Emily Brontë"},
        {"Great Expectations", "Charles Dickens"},
        {"Frankenstein", "Mary Shelley"},
        {"The Odyssey", "Homer"},
        {"The Iliad", "Homer"},
        {"The Brothers Karamazov", "Fyodor Dostoevsky"},
        {"One Hundred Years of Solitude", "Gabriel García Márquez"},
        {"Les Misérables", "Victor Hugo"},
        {"Catch-22", "Joseph Heller"},
        {"Slaughterhouse-Five", "Kurt Vonnegut"},
        {"The Picture of Dorian Gray", "Oscar Wilde"},
        {"The Grapes of Wrath", "John Steinbeck"},
        {"Dracula", "Bram Stoker"},
        {"Anna Karenina", "Leo Tolstoy"},
        {"Fahrenheit 451", "Ray Bradbury"},
        {"The Hobbit", "J.R.R. Tolkien"},
        {"Don Quixote", "Miguel de Cervantes"},
        {"The Sound and the Fury", "William Faulkner"},
        {"A Tale of Two Cities", "Charles Dickens"}
    };

    private static final String[] names = {
            "James Smith", "Mary Johnson", "Robert Brown", "Patricia Garcia", "John Miller",
            "Jennifer Davis", "Michael Rodriguez", "Linda Martinez", "William Hernandez", "Elizabeth Lopez",
            "David Gonzalez", "Susan Wilson", "Joseph Anderson", "Jessica Thomas", "Charles Taylor",
            "Sarah Moore", "Thomas Jackson", "Karen Martin", "Daniel Lee", "Emily Perez",
            "Matthew Thompson", "Lisa White", "Anthony Harris", "Barbara Clark", "Christopher Lewis"
    };

    static {
        bookNum = (int) (Math.random() * bookArchive.length);
    }

    private static Book generateRandomBook() {
        int currBook = bookNum++ % bookArchive.length;
        return new Book(bookArchive[currBook][0], bookArchive[currBook][1], (int) (Math.random() * 3) + 1);
    }

    private static List<Book> generateRandomBookList(int numOfBooks) {
        List<Book> books = new ArrayList<>();
        for (int i = 0; i < numOfBooks; i++)
            books.add(generateRandomBook());
        return books;
    }

    private static Member generateRandomMember() {
        String randName = names[(int) (names.length * Math.random())];
        return new Random().nextBoolean() ? new PremiumMember(randName, new ArrayList<>()) : new RegularMember(randName, new ArrayList<>());
    }

    private static List<Member> generateRandomMemberList(int numOfMembers) {
        List<Member> members = new ArrayList<>();
        for (int i = 0; i < numOfMembers; i++)
            members.add(generateRandomMember());
        return members;
    }

    public static Library createLibrary(int numOfMembers, int numOfBooks) {
        List<Book> books = generateRandomBookList(numOfBooks);
        List<Member> members = generateRandomMemberList(numOfMembers);
        return new Library(books, members);
    }

}
