package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
//        ex1Animal();
//        ex2Shape();
        ex3ButtonClick();
    }

    public static void ex1Animal() {
        Animal animal = new Animal();

        Animal dog = new Animal() {
            @Override
            public void speak() {
                System.out.println("Woof!");
            }
        };

        Animal cat = new Animal() {
            @Override
            public void speak() {
                System.out.println("Meow!");
            }
        };

        System.out.println("Testing:");
        System.out.println("Testing: Animal");
        animal.speak();
        System.out.println("Testing: Dog Anonymous:");
        dog.speak();
        System.out.println("Testing: Cat Anonymous ");
        cat.speak();
    }

    public static void ex2Shape() {

        Shape rectangle = new Shape() {
            private final int length = 4;
            private final int width = 5;

            @Override
            public int area() {
                return length * width;
            }
        };

        Shape square = new Shape() {
            private final int side = 7;

            @Override
            public int area() {
                return side * side;
            }
        };

        System.out.println("Testing:");
        System.out.println("Testing: Rectangle");
        System.out.println(rectangle.area());
        System.out.println("Testing: Square");
        System.out.println(square.area());

    }

    public static void ex3ButtonClick() {

        Button submit = new Button() {
            @Override
            public void onClick() {
                System.out.println("Submit button clicked: Form submitted.");
            }
        };

        ClickListener cancel = new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Cancel button clicked: Action Canceled.");
            }
        };

        submit.onClick();
        cancel.onClick();

    }
}