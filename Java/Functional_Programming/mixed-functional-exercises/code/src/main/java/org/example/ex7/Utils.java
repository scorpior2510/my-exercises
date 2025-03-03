package org.example.ex7;

import java.util.List;
import java.util.Optional;

public class Utils {

    public static Optional<Integer> findFirstEvenGreaterThan50(List<Integer> list) {
        if (list == null)
            throw new IllegalArgumentException("List Cannot be null");
        return list.stream().filter(num -> num % 2 == 0 && num > 50).findFirst();
    }
}
