# jackson-deserialization
How to deserialization json to Java8 dateTimes

## Jackson Dependency
```
<dependency>
    <groupId>com.fasterxml.jackson.datatype</groupId>
    <artifactId>jackson-datatype-jsr310</artifactId>
    <version>2.11.0</version>
</dependency>
```
Actually it needs only the following dependency alone, it already includes
![img.png](img.png)

## JSR310

Datatype module to make Jackson recognize Java 8 Date & Time API data types (JSR-310).

This module adds support for quite a few classes:

- Duration
- Instant
- LocalDateTime
- LocalDate
- LocalTime
- MonthDay
- OffsetDateTime
- OffsetTime
- Period
- Year
- YearMonth
- ZonedDateTime
- ZoneId
- ZoneOffset


https://www.baeldung.com/jackson-serialize-dates
