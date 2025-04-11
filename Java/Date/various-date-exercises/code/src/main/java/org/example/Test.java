package org.example;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Test {

    private static void testEx1() {
        Utils.testTitle(1, "start", "Create and Print Dates");

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        Utils.testTitle(1, "end", "Create and Print Dates");
    }

    private static void testEx2() {
        Utils.testTitle(2, "start", "Parse and Format Dates");

        LocalDate localDate = LocalDate.parse("2025-03-25");
        System.out.println(localDate);
        String str = localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(str);

        Utils.testTitle(2, "end", "Parse and Format Dates");
    }

    private static void testEx3() {
        Utils.testTitle(3, "start", "Get Components of a Date");

        LocalDate localDate = LocalDate.parse("2025-06-10");
        System.out.println("Year: " + localDate.getYear());
        System.out.println("Month: " + localDate.getMonth());
        System.out.println("Day: " + localDate.getDayOfMonth());

        Utils.testTitle(3, "end", "Get Components of a Date");
    }

    private static void testEx4() {
        Utils.testTitle(4, "start", "Modify Dates");

        LocalDate localDate = LocalDate.parse("2025-03-25");
        localDate = localDate.plusDays(5).minusWeeks(2);
        System.out.println(localDate);

        localDate = localDate.withMonth(12);
        System.out.println(localDate);

        Utils.testTitle(4, "end", "Modify Dates");
    }

    private static void testEx5() {
        Utils.testTitle(5, "start", "Compare Dates");

        LocalDate localDate2 = LocalDate.parse("2025-03-10");
        LocalDate localDate1 = LocalDate.parse("2025-05-15");
        System.out.printf("Date1: %s, Date2: %s, %s",
                localDate1.format(DateTimeFormatter.ofPattern("dd-MM-yy")),
                localDate2.format(DateTimeFormatter.ofPattern("dd-MM-yy")),
                localDate1.isBefore(localDate2) ? "Date1 is before Date2" : "Date2 is before Date1");

        Utils.testTitle(5, "end", "Compare Dates");
    }

    private static void testEx6() {
        Utils.testTitle(6, "start", "Difference Between Dates");

        LocalDate localDate1 = LocalDate.parse("2025-03-01");
        LocalDate localDate2 = LocalDate.parse("2025-03-25");
        System.out.printf("Date1: %s, Date2: %s, %s\n",
                localDate1.format(DateTimeFormatter.ofPattern("dd-MM-yy")),
                localDate2.format(DateTimeFormatter.ofPattern("dd-MM-yy")),
                ChronoUnit.DAYS.between(localDate1, localDate2));

        Utils.testTitle(6, "end", "Difference Between Dates");
    }

    private static void testEx7() {
        Utils.testTitle(7, "start", "Convert Between Time Zones");

        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.of(2025, 3, 25, 1, 0, 0), ZoneId.of("Asia/Jerusalem"));
        System.out.println(zonedDateTime);
        zonedDateTime = zonedDateTime.withZoneSameInstant(ZoneId.of("US/Pacific"));
        System.out.println(zonedDateTime);

        Utils.testTitle(7, "end", "Convert Between Time Zones");
    }

    private static void testEx8() {
        Utils.testTitle(8, "start", "Create a Custom Formatter");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEE, dd MMM yyyy", Locale.ENGLISH);
        System.out.println(LocalDateTime.now().format(dateTimeFormatter));

        Utils.testTitle(8, "end", "Create a Custom Formatter");
    }

    private static void testEx9() {
        Utils.testTitle(9, "start", "Work with instant and duration");

        Instant instant = Instant.now();
        instant = instant.plus(Duration.ofHours(5));
        System.out.println(instant);

        Utils.testTitle(9, "end", "Work with instant and duration");
    }

    private static void testEx10() {
        Utils.testTitle(10, "start", "Find the Last Day of a Month");

        YearMonth yearMonth = YearMonth.of(2025, 3);
        LocalDate localDate = yearMonth.atEndOfMonth();
        System.out.println(localDate);

        Utils.testTitle(10, "end", "Find the Last Day of a Month");
    }

    private static void testEx11() {
        Utils.testTitle(11, "start", "Schedule a Task 3 Months from Now");

        LocalDateTime localDateTime = LocalDateTime.now();
        localDateTime = localDateTime.plusMonths(3).withHour(15).withMinute(30);
        System.out.println(localDateTime);

        Utils.testTitle(11, "end", "Schedule a Task 3 Months from Now");
    }

    private static void testEx12() {
        Utils.testTitle(12, "start", "Convert LocalDateTime to Instant");

        LocalDateTime localDateTime = LocalDateTime.parse("2025-03-25T14:00");
        System.out.println(localDateTime);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("Asia/Tokyo"));
        System.out.println(zonedDateTime);
        Instant instant = zonedDateTime.toInstant();
        System.out.println(instant);

        Utils.testTitle(12, "end", "Convert LocalDateTime to Instant");
    }

    private static void testEx13() {
        Utils.testTitle(13, "start", "Find the Next Friday After a Given Date");

        LocalDate localDate = LocalDate.parse("2025-03-25");
        System.out.println(localDate);
        localDate = localDate.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(localDate);

        Utils.testTitle(13, "end", "Find the Next Friday After a Given Date");
    }

    private static void testEx14() {
        Utils.testTitle(14, "start", "Work with Leap Years");

        System.out.println("Is 2024 Leap year? " + (Year.isLeap(2024) ? "Yes" : "No"));
        System.out.println("Is 2025 Leap year? " + (Year.isLeap(2025) ? "Yes" : "No"));
        System.out.println("Is 2028 Leap year? " + (Year.isLeap(2028) ? "Yes" : "No"));

        Utils.testTitle(14, "end", "Work with Leap Years");
    }

    private static void testEx16() {
        Utils.testTitle(16, "start", "Find Overlapping Time Intervals");

        LocalTime localTime1Start = LocalTime.of(8, 30);
        LocalTime localTime1End = LocalTime.of(11, 0);
        LocalTime localTime2Start = LocalTime.of(10, 0);
        LocalTime localTime2End = LocalTime.of(12, 0);

        boolean overlap;
        if (localTime1Start.isBefore(localTime2Start)) {
            overlap = localTime2Start.isBefore(localTime1End);
        } else {
            overlap = localTime1Start.isBefore(localTime2End);
        }
        System.out.println(overlap);

        Utils.testTitle(16, "end", "Find Overlapping Time Intervals");
    }

    private static void testEx17() {
        Utils.testTitle(17, "start", "Generate a List of Dates in a Range");

        LocalDate localDateStart = LocalDate.parse("2025-03-01");
        LocalDate localDateEnd = LocalDate.parse("2025-03-07");
        List<LocalDate> list = new ArrayList<>();

        LocalDate currDate = localDateStart;
        while (currDate.isBefore(localDateEnd)) {
            list.add(currDate);
            currDate = currDate.plusDays(1);
        }

        list.forEach(System.out::println);

        Utils.testTitle(17, "end", "Generate a List of Dates in a Range");
    }

    private static void testEx18() {
        Utils.testTitle(18, "start", "Work with Multiple Time Zones in a Flight Schedule");

        ZonedDateTime start = ZonedDateTime.of(LocalDateTime.parse("2025-03-25T18:00"), ZoneId.of("America/New_York"));
        ZonedDateTime finish = start.plusHours(10);
        System.out.println(finish);
        finish = finish.withZoneSameInstant(ZoneId.of("Europe/Paris"));
        System.out.println(finish);
//        ZoneId.getAvailableZoneIds().forEach(System.out::println);

        Utils.testTitle(18, "end", "Work with Multiple Time Zones in a Flight Schedule");
    }

    private static void testEx19() throws InterruptedException {
        Utils.testTitle(19, "start", "Implement a Simple Countdown Timer");

        Duration duration = Duration.ofSeconds(10);
        for (long i = duration.getSeconds(); i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        Utils.testTitle(19, "end", "Implement a Simple Countdown Timer");
    }

    public static void main(String[] args) throws InterruptedException {

        testEx19();

    }
}
