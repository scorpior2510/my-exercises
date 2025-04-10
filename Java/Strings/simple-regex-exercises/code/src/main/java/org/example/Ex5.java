package org.example;

import java.util.regex.Pattern;

public class Ex5 {

    public static boolean containsOnlyLowercaseLetters(String input) {
        return Pattern.matches("[a-z]+", input);
    }

}
