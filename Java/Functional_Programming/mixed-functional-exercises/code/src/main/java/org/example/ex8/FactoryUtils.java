package org.example.ex8;

import java.util.Optional;

public class FactoryUtils {

    public static Optional<Shape> generateShapeByType(String type) {
        Shape shape = null;
        if (type.equals("Circle")) {
            shape = Circle::new;
            System.out.println(shape);
        }
        if (type.equals("Rectangle"))
            shape = Circle::new;
        return Optional.ofNullable(shape);
    }

}
