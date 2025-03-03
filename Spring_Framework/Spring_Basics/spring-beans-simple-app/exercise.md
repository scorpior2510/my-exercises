# Exercise: Spring Beans Simple App

## Details
- Exercise Type: ChatGpt Generated

## ChatGpt Prompt
i am learning spring framework and i'm relatively at the beginning. i want to create a very basic spring app that put's focus on managing some 3-4 beans/components some configured with annotations, and some in the @Configuration class. can you create a small exercise with this requirements (should not exceed 40 minutes at length).

## Description

Here’s a straightforward Spring exercise to help you manage beans and configurations. 
This task should give you a good hands-on experience with Spring beans, configuration via annotations, and a @Configuration class. 
Let’s create a small application that simulates a basic "Order Processing" system with three main components: OrderService, ProductService, and CustomerService.

Exercise: Basic Spring Order Processing App
Objective: Build a Spring application to demonstrate bean configuration using annotations and a @Configuration class.
Steps:
1.	Setup the Spring Project:
Create a new Spring project in your IDE (like IntelliJ or Eclipse).
Include the necessary Spring dependencies (spring-context).
2.	Define Components (Beans):
Create three simple classes: OrderService, ProductService, and CustomerService.
Each class should print out a message when initialized, for example, "OrderService initialized".
3.	Component Annotations:
Annotate OrderService and ProductService with @Component.
In OrderService, add a dependency on ProductService via constructor injection.
4.	Configuration Class:
Create a @Configuration class, AppConfig.
In this class, define a CustomerService bean using the @Bean annotation.
5.	Application Runner:
In the main application class (or another class), use @ComponentScan to locate @Component-annotated classes and @Configuration to load the AppConfig class.
Retrieve the beans using ApplicationContext and call a sample method (like processOrder() in OrderService) to verify everything is wired correctly.

Run the Application:
When you run the application, you should see output confirming that each service is being called as expected, demonstrating how Spring manages these components.
This exercise should take about 30-40 minutes to complete. Let me know if you'd like any additional details on any part of this setup!

## Resources
- [ChatGpt Generated Related Code](resources/ChatGpt%20Generated%20Related%20Code.docx)