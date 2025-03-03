package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class GenericManagedObject {
    private String name;

    public GenericManagedObject(String name) {
        this.name = name;
        System.out.println(this.name + " Was Created");
    }

    public GenericManagedObject() {
        this.name = "Base Generic Object";
        System.out.println(this.name + " Was Created");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
