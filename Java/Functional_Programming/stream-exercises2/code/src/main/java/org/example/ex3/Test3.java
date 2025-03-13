package org.example.ex3;

import org.example.ex2.FindLongest;

import java.util.List;

public class Test3 {

    public static void main(String... args) {
        System.out.println("----Test3: UniqueCharacters----\n");
        String str = "abcabcabcd";
        System.out.println("Testing list: " + str);
        System.out.println("Number of Unique Characters: " + UniqueCharacters.uniqueCharacters(str));
        System.out.println("\n----Test3: UniqueCharacters----");
    }

}
