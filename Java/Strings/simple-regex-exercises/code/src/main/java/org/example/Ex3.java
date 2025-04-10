package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex3 {

    public static int countDigitSequences(String input) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        while (matcher.find())
            count++;
        return count;
    }

}
