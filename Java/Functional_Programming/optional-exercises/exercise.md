# Exercise: Optional Exercises

## Details
- Exercise Type: ChatGpt Generated
- Num of Exercises: 7

## ChatGpt Prompt
can you generate 7 exercises with increasing difficulty from basic to intermediate - practicing Optional in java?

## Description
1. Basic Creation and Usage
Task:
Create an Optional variable containing a String. Print its value if present; otherwise, print "No value present".

Hints:
- Use Optional.ofNullable().
- Use ifPresentOrElse() (Java 9+), or check isPresent().
---
2. Default Value with orElse()
Task:
Write a method getUserName(String username) that returns an Optional<String>. If the username is null, return Optional.empty(). Otherwise, return Optional.of(username).
Call this method and use orElse() to provide a default username ("Guest").

Hints:
- Use orElse() to handle empty cases.
---
3. Using map() with Optional
Task:
Write a method that receives an Optional<String> and returns an Optional<Integer> representing the length of the string (if present).

Hints:
- Use map() to transform the value inside Optional.
---
4. Using flatMap() to Avoid Nested Optionals
Task:
Create a User class with an Optional<Address>. The Address class should have an Optional<String> zipcode.
Write a method getZipCode(User user) that returns an Optional<String> containing the zipcode if present.

Hints:
- Use flatMap() to avoid Optional<Optional<T>>.
---
5. Filtering Values
Task:
Write a method findEvenNumber(Optional<Integer> number). If the number inside the Optional is even, return it; otherwise, return Optional.empty().

Hints:
- Use filter() to retain only even numbers.
---
6. Combining Optionals with or()
Task:
Write a method getPrimaryEmail(Optional<String> primary, Optional<String> backup) that returns the first present email.
If the primary email is missing, return the backup if present.

Hints:
- Use or() (Java 9+) to supply an alternative Optional.
---
7. Handling Optional in a Stream
Task:
Given a List<Optional<Integer>>, write a method that returns a List<Integer> containing only the present values.

- Use flatMap() with Stream to filter out empty values.
---
Let me know if you need solutions or modifications! 🚀