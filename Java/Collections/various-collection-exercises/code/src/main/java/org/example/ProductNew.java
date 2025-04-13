package org.example;

import java.util.Objects;

public class ProductNew {
    private int id;
    private String name;
    private double price;

    public ProductNew(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductNew that = (ProductNew) o;
        return id == that.id && Double.compare(price, that.price) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    @Override
    public String toString() {
        return "(" + this.id + ") " + this.name + ", " + this.price;
    }
}
