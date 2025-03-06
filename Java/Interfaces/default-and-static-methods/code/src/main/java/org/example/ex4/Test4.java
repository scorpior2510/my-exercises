package org.example.ex4;

public class Test4 {
    public static void main(String... args) {

        InterfaceB interfaceB = new MultiInterfaceClass();
        InterfaceA interfaceA = new MultiInterfaceClass();

        interfaceA.show();
        interfaceB.show();

    }
}
