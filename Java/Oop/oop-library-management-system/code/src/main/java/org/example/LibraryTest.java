package org.example;

import java.util.ArrayList;

public class LibraryTest {
    
    public static void main(String[] args) {

        Library library = LibraryFactory.createLibrary(15, 25);
        library.printLibrary();

//        System.out.println("\n--------------------------------\n");
//
//        library.borrowBook(4, 3);
//        library.borrowBook(4, 3);
//        library.borrowBook(4, 3);
//        library.borrowBook(4, 3);
//        library.borrowBook(4, 3);
//        library.borrowBook(10, 2);
//        library.borrowBook(10, 2);
//        library.borrowBook(10, 2);
//        library.borrowBook(10, 2);
//        library.borrowBook(10, 2);
//        library.borrowBook(10, 2);
//        library.borrowBook(15, 18);
//        library.borrowBook(15, 50);
//        library.borrowBook(50, 12);
//
//        library.printLibrary();

        System.out.println("\n--------------------------------\n");

        library.registerMember(new RegularMember("aaa", new ArrayList<>()));
        library.registerMember(new PremiumMember("bbb", new ArrayList<>()));

        library.printLibrary();

        System.out.println("\n--------------------------------\n");

        library.borrowBook(7, 8);
        library.borrowBook(7, 9);
        library.borrowBook(7, 11);

        library.printLibrary();

        System.out.println("\n--------------------------------\n");

        library.returnBook(7, 9);

        library.printLibrary();

        System.out.println("\n--------------------------------\n");

        library.returnBook(7, 8);
        library.returnBook(7, 11);

        library.printLibrary();
    }
}