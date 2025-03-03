# Exercise: Movie Crud App

## Details
- Exercise Type: ChatGpt Generated
- Num of Exercises: 3

## ChatGpt Prompt
can you generate an exercise for creating a small crud java application for managing a database? should follow these instructions: 1. should be small (3-6 hours to complete end to end) 2. should take into consideration working with DriverManager (and not DataSource) 3. using maven 4. should focus on working with db with no elaborate logic or complex stuff 5. should assume using mysql db.

## Description
Here’s a simple CRUD Java application exercise for managing a MySQL database, following your guidelines:
Project Description:
You will create a small command-line Java application to manage a database of "Movies." This exercise involves creating, reading, updating, and deleting movie records from a MySQL database using JDBC with DriverManager.
Instructions:
- Install MySQL and ensure it's running.
- Create a new Maven project.
- Add the MySQL JDBC driver dependency in pom.xml:
- Database Setup:
  - Create a MySQL database named cinema_db.
  - Create a movies table with fields: id, title, genre, release_year, and director
- Basic CRUD Operations:
You will implement the following CRUD operations:
For each operation, write methods that interact with the MySQL database using JDBC and DriverManager.
  1.	Create: Add a new movie record.
  2.	Read: Retrieve and display all movie records.
  3.	Update: Update a movie's details.
  4.	Delete: Delete a movie record by ID.
- Code Implementation:
  - Database Connection: Create a utility class (DatabaseConnection) to manage the connection to MySQL using DriverManager.
  - Movie Class: Create a Movie class to represent the movie entity:
  - CRUD Methods: Implement the CRUD operations in a MovieRepository class.
- Command-Line Interface:
  - Create a simple command-line interface that allows the user to select options (e.g., "1. Add Movie," "2. View Movies," "3. Update Movie," "4. Delete Movie").
  - Implement user input using Scanner to interact with the database.
- Testing & Debugging:
  - Run the application and test each CRUD operation by adding, retrieving, updating, and deleting movie records from the database.

- Deliverables:
  - Functional CRUD Java application.
  - Maven pom.xml file with the MySQL JDBC driver dependency.
  - SQL file with database schema creation.
  - Basic command-line interface.
- Extra Challenge (Optional):
  - Add basic input validation for movie attributes (e.g., release year should be a valid year).
 - Enhance the user interface with more meaningful prompts or error messages.

## ChatGpt Solution Analysis
Your solution is correct, both in terms of functionality and your conclusion in the comments. Here’s a breakdown of why this is accurate:
Solution Review
Traditional For Loop Solution:

You correctly use a for loop to iterate over each element in the list.
The if condition checks for even numbers, and you print them as expected.
forEach with Stream:

You use stream() to create a stream from the list.
filter(num -> num % 2 == 0) filters for even numbers, and forEach(num -> System.out.print(num + "\t")) prints each even number.
This solution is shorter, more concise, and easy to read.
Analysis of Appropriateness
Since this exercise is focused on filtering and printing (without modifying the list), the Stream-based solution is indeed more suitable. Here’s why:

Conciseness: The Stream-based approach is more compact, expressing filtering and printing in a single line.
Readability: Streams make the intent (filtering and printing even numbers) immediately clear.
Functionality: Both approaches give the same output without modifying the original list.
In cases where the primary goal is to filter and output data without modifying the collection, the Stream-based solution is often preferred due to its clarity and reduced verbosity.

Conclusion
Your comment is spot-on: the Stream-based approach is better here because it is shorter, more concise, and more readable than the traditional for loop for this specific scenario. Great job!

## Resources
- [sql queries.sql](resources/sql%20queries.sql)
- [sql queries2.sql](resources/sql%20queries2.sql)





# Exercise: [Exercise Name]

## Details
- Exercise Type: [ChatGpt Generated | Type2]
- Num of Exercises: [Number]

## ChatGpt Prompt
[ChatGpt Prompt]

## Description
[Description]

## ChatGpt Solution Analysis
[ChatGpt Analysis]

## Resources
- [sql queries.sql](resources/sql%20queries.sql)
- [sql queries2.sql](resources/sql%20queries2.sql)









Resources: 
- [Java Stream API (Official Docs)](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/package-summary.html)
- [Stream Processing in Java (Tutorial)](https://www.baeldung.com/java-streams)
ChatGpt Analysis: 
Notes: 

## Useful Sequence:
## Second Level
- **Last Completed:** [YYYY-MM-DD or "Not Yet"]
- **Status:** [Not Started | In Progress | Needs Review | Completed]


## Subheading
### Sub-subheading

## Unordered List:
List:
- (item 1) Last Completed (with date as date): _2025-02-28_
- (item 1) Last Completed (with date as simple text): 2025-02-28
- (item 2) Difficulty: Beginner
- (item 3) Status: Needs Review

## Ordered List:
List:
1. First
2. Second
3. Third

## Multiple level list:
List:
- (item 1) item1
  - inside1
    - inside inside
  - inside2
- (item 2) item2

## Links:
Links:
[Link Text - ordinary](https://www.google.com)
[Link Text - Relative to something in the repository](Java/Streams/Filter_Map/tracking.md)

## Emphasizing Text:
**bold text**
*italic text*
ordinary text
Marking special: `@Configuration`

## Line Break:
---



