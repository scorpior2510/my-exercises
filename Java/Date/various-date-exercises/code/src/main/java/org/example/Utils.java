package org.example;

public class Utils {

    public static void testTitle(int num, String startOrEnd, String description) {
        if (startOrEnd.equals("start")) {
            System.out.println("\n------Test Start - Exercise " + num + ": " + description + "\n");
        }
        if (startOrEnd.equals("end")) {
            System.out.println("\n------Test End - Exercise " + num + ": " + description);
        }
    }
}
