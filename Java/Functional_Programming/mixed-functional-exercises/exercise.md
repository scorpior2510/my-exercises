# Exercise: Mixed Functional Exercises

## Details
- Exercise Type: ChatGpt Generated
- Num of Exercises: 12

## ChatGpt Prompt
i have finished studying about functional programming in java. My learning included: 1. A general overview about functional programming and how it is achieved in java 2. Nested Classes 3. Lambda Expressions 4. Method References 5. Functional Interfaces 6. invokedynamic & lambda mechanism 7. Stream & Aggregate operations 8. optional please generate 12 exercises covering those subjects according to the following specifications: 1. exercises should be with increasing difficulty - level from 3 to 8 out of 10. 2. the exercises should mix and can integrate more than one concept. 3. each exercise should take about 20 - 40 minutes to solve. 4. don't be explicit with how to approach or solve the exercises and don't provide hints. 

## Description

1. Nested Transformer (Level 3/10)
Create a class WordTransformer with a nested static class Reverser that provides a method to reverse a word. The WordTransformer class should have a method that takes a list of words and returns a new list where each word is reversed. Use a functional approach where possible.
---
2. Employee Salary Filter (Level 4/10)
Given a list of employees (Employee class with name, salary fields), write a method that returns the names of employees earning more than a given amount. Use Stream and Optional to achieve this efficiently.
---
3. Functional Comparator (Level 4/10)
Create a Person class with name and age. Use a method reference to sort a list of Person objects by age in ascending order. Additionally, provide a lambda-based comparator that sorts them in descending order.
---
4. Nested Interface for Data Processing (Level 5/10)
Define an interface Processor<T> inside a class DataProcessor with a method process(T input). Implement two versions:
- One using an anonymous class.
- One using a lambda expression.
Write a method that applies both implementations to a list of numbers to double their values.
---
5. Dynamic Function Pipeline (Level 5/10)
Write a method that takes a list of Function<Integer, Integer> transformations and applies them sequentially to an integer value. The transformations can include doubling, squaring, and adding 5. Implement this using method references where applicable.
---
6. Chaining Functional Interfaces (Level 6/10)
Create a functional interface Transformer<T> with a method T transform(T input). Implement it for String transformations, including:
- Uppercasing
- Removing spaces
- Reversing the string
Create a method that takes a list of Transformer<String> and applies them in sequence to a given string.
---
7. Lazy Stream Evaluation with Optional (Level 6/10)
Create a list of numbers and use a stream to find the first even number greater than 50. If such a number exists, return it wrapped in an Optional. If not, return Optional.empty(). Ensure that the stream is evaluated lazily.
---
8. Method Reference Factory (Level 7/10)
Define a Shape interface with a method draw(). Implement it with Circle and Rectangle classes. Write a factory method that takes a String ("circle" or "rectangle") and returns an instance using method references.
---
9. Parallel Stream Processing (Level 7/10)
Create a list of 1 million integers. Use a parallel stream to filter out prime numbers, then map the remaining numbers to their squares, and finally collect them into a list. Measure and compare the execution time of using parallel and sequential streams.
---
10. Dynamic Functional Pipeline with Currying (Level 8/10)
Write a curried function that performs a calculation (a * b) + c. First, define a function that takes a, then returns another function that takes b, and finally returns a function that takes c. Test it with different values.
---
11. Function Memoization with Optional (Level 8/10)
Implement a caching system that stores results of expensive computations. Define a method that takes an Integer and returns its factorial, caching the results using an Optional<Integer> to avoid redundant calculations.
---
12. Custom Functional Collector (Level 8/10)
Implement a custom Collector<T, A, R> to collect a stream of strings into a single string with a given delimiter, prefix, and suffix (e.g., "[a, b, c]").

## ChatGpt Analysis
See Resources

## Resources
[Chatgpt Analysis.docx](resources/ChatGpt%20analysis.docx)