package org.example.base;

import java.util.Collection;

public class Utils {

    public static void printIterable(Collection<?> col) {
        for (Object object : col) {
            System.out.println(object);
        }
    }

}
