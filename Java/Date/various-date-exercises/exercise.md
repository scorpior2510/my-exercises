# Exercise: Various Date Exercises

## Details
- Exercise Type: ChatGpt Generated
- Num of Exercises: 20

## ChatGpt Prompt
finished learning this article: https://www.baeldung.com/java-8-date-time-intro can you generate about 20 small atomic exercises (10-20 minutes a piece) for the Date time api's mentioned in the article. my goal is to practice using it. 5 last exercises should increase in difficulty and introduce things with more logic

## Description

Here are 20 atomic exercises based on the Java 8 Date-Time API, starting with fundamental operations and gradually increasing in complexity.

### 1. Create and Print Dates
•	Create a LocalDate, LocalTime, and LocalDateTime instance for the current date and time.
•	Print each of them separately.

### 2. Parse and Format Dates
•	Parse a String ("2025-03-25") into a LocalDate.
•	Convert it back into a String using DateTimeFormatter.ofPattern("dd/MM/yyyy").

### 3. Get Components of a Date
•	Create a LocalDate representing "2025-06-10".
•	Extract and print the year, month, and day.

### 4. Modify Dates
•	Start with LocalDate.of(2025, 3, 25).
•	Add 5 days, subtract 2 weeks, and print the result.
•	Set the month to December.

### 5. Compare Dates
•	Create two dates: 2025-03-10 and 2025-05-15.
•	Determine which one is earlier using isBefore().

### 6. Difference Between Dates
•	Find the number of days between "2025-03-01" and "2025-03-25" using ChronoUnit.DAYS.between().

### 7. Convert Between Time Zones
•	Create a ZonedDateTime for 2025-03-25T10:00 in ZoneId.of("Europe/Paris").
•	Convert it to "America/New_York".

### 8. Create a Custom Formatter
•	Create a formatter that formats dates as "EEE, dd MMM yyyy" (e.g., "Tue, 25 Mar 2025").
•	Format a LocalDateTime using this pattern.

### 9. Work with Instant and Duration
•	Create an Instant representing the current timestamp.
•	Add Duration.ofHours(5) to it and print the new timestamp.

### 10. Find the Last Day of a Month
•	Create a YearMonth for March 2025.
•	Determine the last day of that month.

### 11. Schedule a Task 3 Months from Now
•	Create a LocalDateTime instance for today.
•	Add 3 months and set the time to "15:30".

### 12. Convert LocalDateTime to Instant
•	Take "2025-03-25T14:00" in ZoneId.of("Asia/Tokyo").
•	Convert it to an Instant.

### 13. Find the Next Friday After a Given Date
•	Start with LocalDate.of(2025, 3, 25).
•	Use TemporalAdjusters.next(DayOfWeek.FRIDAY) to find the next Friday.

### 14. Work with Leap Years
•	Check if the years 2024, 2025, and 2028 are leap years.

### 15. Convert Date (Legacy API) to LocalDateTime
•	Convert a java.util.Date to LocalDateTime.

### 16. Find Overlapping Time Intervals
•	Given two LocalTime intervals:
o	Interval 1: 08:30 - 11:00
o	Interval 2: 10:00 - 12:00
•	Check if they overlap.

### 17. Generate a List of Dates in a Range
•	Given a start date (2025-03-01) and an end date (2025-03-07),
•	Generate a List<LocalDate> containing all dates in between.

### 18. Work with Multiple Time Zones in a Flight Schedule
•	A flight departs from "New York (EST)" at "2025-03-25T18:00".
•	It takes 10 hours to reach "Paris (CET)".
•	Calculate the arrival time in Paris.

### 19. Implement a Simple Countdown Timer
•	Use Duration and Thread.sleep() to create a 10-second countdown.

### 20. Calculate an Employee's Work Hours in a Week
•	Given a work schedule with daily start and end times,
•	Calculate the total number of hours worked in a week.