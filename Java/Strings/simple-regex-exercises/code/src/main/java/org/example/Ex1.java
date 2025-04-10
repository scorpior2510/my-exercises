package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {

    public static boolean findIfWordExists(String word, String input) {
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

}
