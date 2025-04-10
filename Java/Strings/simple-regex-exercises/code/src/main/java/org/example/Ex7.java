package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex7 {

    public static boolean startsWithLetterACaseInsensitive(String input) {
        Pattern pattern = Pattern.compile("\\b[Aa]\\w");
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

}
