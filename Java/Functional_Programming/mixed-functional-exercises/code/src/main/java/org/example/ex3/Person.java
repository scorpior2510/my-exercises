package org.example.ex3;

public class Person {

    private static int count = 1;

    private String name;
    private int age;

    public Person() {
        this.name = "Person" + count++;
        this.age = (int) (Math.random() * 70) + 10;
    }

    public int getAge() {
        return age;
    }

    public static int compareByAge(Person p1, Person p2) {
        if (p1 == null || p2 == null)
            throw new IllegalArgumentException("Illegal Arguments to compareByAge of Person class");
        return Integer.compare(p1.getAge(), p2.getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
