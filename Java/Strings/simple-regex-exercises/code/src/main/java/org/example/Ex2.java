package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {

    public static boolean findIfDigitExists(String input) {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

}
