package org.example;

import java.util.*;

public class ProductInventorySystem {

    private final Map<Integer, ProductNew> products;

    public ProductInventorySystem() {
        this.products = new HashMap<>();
    }

    public void addToInventory(ProductNew product) {
        this.products.put(product.getId(), product);
    }

    public void addAllToInventory(ProductNew... products) {
        for (ProductNew productNew : products)
            this.addToInventory(productNew);
    }

    public void removeFromInventory(ProductNew product) {
        this.products.remove(product.getId());
    }

    public void showInventoryListOrderedByPrice() {
        Set<ProductNew> products = new TreeSet<>(Comparator.comparingDouble(ProductNew::getPrice));
        products.addAll(this.products.values());
        System.out.println("Inventory Products:");
        for (ProductNew productNew : products)
            System.out.println(productNew);
    }

    public Optional<ProductNew> findById(int id) {
        return Optional.ofNullable(this.products.get(id));
    }

    public Optional<ProductNew> findByName(String name) {
        return this.products.values().stream().filter(productNew -> name.equals(productNew.getName())).findFirst();
    }

    public String toString() {
        StringJoiner stringJoiner = new StringJoiner("\n","Inventory:\n","");
        for (ProductNew productNew : this.products.values())
            stringJoiner.add(productNew.toString());
        return stringJoiner.toString();
    }
}
