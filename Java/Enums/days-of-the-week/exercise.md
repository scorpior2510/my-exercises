# Exercise: Days of the Week Scheduler

## Details
- Exercise Type: ChatGpt Generated
- Num of Exercises: 1

## Description
- Objective: Create an enum representing the days of the week and use it to manage a simple "scheduler" for activities.
- Instructions:
  - Create an enum called Day with constants for each day of the week (MONDAY, TUESDAY, etc.).
  - Add a method isWeekend() to the enum that returns true if the day is Saturday or Sunday, and false otherwise.
  - Add a method activity() to the enum that:
  Returns a default activity for each day (e.g., "Work" for weekdays, "Relax" for weekends).
  You can choose the activities based on your preference.
  - Create a main method that:
  Loops through each day of the week and prints the day, whether it's a weekend, and the activity for that day.
- Example Output:
MONDAY: Work (Weekend: false)
TUESDAY: Work (Weekend: false)
WEDNESDAY: Work (Weekend: false)
THURSDAY: Work (Weekend: false)
FRIDAY: Work (Weekend: false)
SATURDAY: Relax (Weekend: true)
SUNDAY: Relax (Weekend: true)
- Hint:
  - Enum constants can have methods and fields, which is useful for associating custom data or behaviors with each constant.