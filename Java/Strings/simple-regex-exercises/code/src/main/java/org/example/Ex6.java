package org.example;

import java.util.regex.Pattern;

public class Ex6 {

    public static boolean isOfDateFormat(String input) {
        return Pattern.matches("\\d{4}-\\d{2}-\\d{2}", input);
    }

}
