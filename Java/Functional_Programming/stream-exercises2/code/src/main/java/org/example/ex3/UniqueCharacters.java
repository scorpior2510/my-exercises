package org.example.ex3;

public class UniqueCharacters {

    public static int uniqueCharacters(String str) {
        if (str == null)
            throw new IllegalArgumentException("Illegal Input. can't get null");
        return (int) str.chars().distinct().count();
    }

}
