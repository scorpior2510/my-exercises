package org.example.ex8;

import org.example.ex7.Utils;

import java.util.List;

public class Ex8Tester {

    public static void test() {
        System.out.println("Test: Ex8 --------------------");
        System.out.println("Trying to generate a circle:");
        FactoryUtils.generateShapeByType("Circle").ifPresent(Shape::draw);
        System.out.println("Trying to generate a Rectangle:");
        FactoryUtils.generateShapeByType("Rectangle").ifPresent(Shape::draw);
        System.out.println("Trying to generate a rectangle:");
        FactoryUtils.generateShapeByType("triangle").ifPresent(Shape::draw);
    }

}
