# Exercise: Movie Crud App

## Details
- Exercise Type: ChatGpt Generated

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

## Resources
- [sql queries.sql](resources/sql%20queries.sql)
- [sql queries2.sql](resources/sql%20queries2.sql)