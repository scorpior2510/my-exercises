package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex4 {

    public static boolean isValidEmailAddress(String input) {
        Pattern pattern = Pattern.compile("\\w+@\\w+[.]\\w+");
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }


}
