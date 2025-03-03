# Exercise: Seasons and Activities

## Details
- Exercise Type: ChatGpt Generated
- Num of Exercises: 1

## Description
- Objective: Enhance an enum representing the four seasons with activities based on time of day.
- Instructions:
  - Create an enum called Season with constants for SPRING, SUMMER, AUTUMN, and WINTER.
  - Add a method activity(String timeOfDay) that:
    - Takes a String representing the time of day ("morning", "afternoon", "evening") and returns a suggested activity for each season and time of day.
    - For example, in SUMMER during "morning", the activity might be "Go for a jog", while in WINTER during "evening", it might be "Drink hot cocoa".
    - Choose your own activities and vary them across seasons and times of day.
  - Create a main method that:
    - Iterates through each season and time of day, printing the season, time, and corresponding activity.

- Twist:
  - Use a switch statement in activity() to determine the correct activity based on timeOfDay.