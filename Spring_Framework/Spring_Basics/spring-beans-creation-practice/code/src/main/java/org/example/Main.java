package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        GenericManagedObject genericObject = context.getBean(GenericManagedObject.class);
        GenericManagedObject objectA = (GenericManagedObject) context.getBean("objectA");
        GenericManagedObject objectB = (GenericManagedObject) context.getBean("objectB");
        GenericManagedObject objectC = (GenericManagedObject) context.getBean("objectC points to B");

        System.out.println();
        System.out.println(genericObject.getName());
        System.out.println(objectA.getName());
        System.out.println(objectB.getName());
        System.out.println(objectC.getName());

        System.out.println();
        System.out.println(context.getBeansOfType(GenericManagedObject.class));



    }
}