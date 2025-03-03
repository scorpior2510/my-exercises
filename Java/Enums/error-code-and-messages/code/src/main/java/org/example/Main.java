package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("List of error codes:");
        for (ErrorCode errorCode : ErrorCode.values())
            System.out.println(errorCode.getFormattedMessage());
    }
}