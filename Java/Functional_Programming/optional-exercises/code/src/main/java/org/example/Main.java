package org.example;

import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static void ex1() {
        System.out.println("Ex1 -----------");
        System.out.println("Optional's Default Value is: not found");
        Optional<String> opt = Optional.empty();
        System.out.println("Value of Empty Optional: " + opt.orElse("Not Found"));
        opt = Optional.of("abc");
        System.out.println("Value of non empty Optional: " + opt.orElse("Not Found"));
    }

    private static Optional<String> getUserName(String userName) {
        return Optional.ofNullable(userName);
    }

    private static void ex2() {
        System.out.println("Ex2 -----------");
        System.out.println("Calling getUserName with value of null");
        Optional<String> opt = opt = getUserName(null);
        System.out.println(opt.orElse("Guest"));
        System.out.println("Calling getUserName with value of abc");
        opt = getUserName("abc");
        System.out.println(opt.orElse("Guest"));
    }

    private static Optional<Integer> lengthOfString(String str) {
        Optional<String> opt = Optional.ofNullable(str);
        return opt.map(String::length);
    }

    private static void ex3() {
        System.out.println("Ex3 -----------");
        System.out.println("Calling lengthOfString with value of null");
        Optional<Integer> opt = lengthOfString(null);
        opt.ifPresent(System.out::println);
        System.out.println("Calling lengthOfString with value of abc");
        opt = lengthOfString("abc");
        opt.ifPresent(System.out::println);
    }

    private static void ex4() {
        System.out.println("Ex4 -----------");
        User user1 = new User();
        Address address2 = new Address(Optional.of("abcd"));
        User user2 = new User(Optional.ofNullable(address2));
        System.out.println("User With No Address: " + user1);
        System.out.println("User With Address: " + user2);
    }

    private static Optional<Integer> findEvenNumber(int number) {
        return Optional.of(number).filter(num -> num % 2 == 0);
    }

    private static void ex5() {
        System.out.println("Ex5 -----------");
        System.out.println("Checking findEvenNumber on 5 (Should Return Empty Optional): " + findEvenNumber(5));
        System.out.println("Checking findEvenNumber on 2 (Should Return Optional With The Number): " + findEvenNumber(4));
    }

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
    }
}