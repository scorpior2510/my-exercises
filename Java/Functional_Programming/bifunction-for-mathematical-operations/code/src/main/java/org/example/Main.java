package org.example;

import java.util.Scanner;
import java.util.function.BiFunction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please Insert First Number");
        int input1 = scan.nextInt();
        System.out.println("Please Insert Second Number");
        int input2 = scan.nextInt();
        System.out.println("Please Choose an Operation from the following list:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        int input3 = scan.nextInt();

        BiFunction<Integer, Integer, Integer> addition = Integer::sum;
        BiFunction<Integer, Integer, Integer> subtraction = (num1, num2) -> num1 - num2;
        BiFunction<Integer, Integer, Integer> multiplication = (num1, num2) -> num1 * num2;
        BiFunction<Integer, Integer, Integer> division = (num1, num2) -> num1 / num2;

        int output = 0;
        switch (input3) {
            case 1:
                output = addition.apply(input1, input2);
                break;
            case 2:
                output = subtraction.apply(input1, input2);
                break;
            case 3:
                output = multiplication.apply(input1, input2);
                break;
            case 4:
                output = division.apply(input1, input2);
                break;
            default:
                System.out.println("Unsupported Operation");
                break;

        }

        System.out.println("The Result of the Chosen Operation on the two numbers is: " + output);

    }
}