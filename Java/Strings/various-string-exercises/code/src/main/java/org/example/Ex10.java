package org.example;

public class Ex10 {

    public static void main(String[] args) {
        System.out.println("\n-----Ex10: Formatting Strings with String.format()\n");

        String name = "Or Cohen";
        int age = 38;

        String formattedNameAndAge = String.format("Hello, my name is %s and I am %d years old.", name, age);
        System.out.println(formattedNameAndAge);

        System.out.println("\n-----Ex10: Formatting Strings with String.format()");
    }


}
