# jackson-deserialization

How to deserialization json to Java8 dateTimes

Java 8 DateTime can be deserialized to POJO directly when having the JSR310 dependency, and must register it within the
ObjectMapper before using the mapper.

## Jackson Dependency

```
<dependency>
    <groupId>com.fasterxml.jackson.datatype</groupId>
    <artifactId>jackson-datatype-jsr310</artifactId>
    <version>2.11.0</version>
</dependency>
```

Actually it needs the following dependency alone, it already includes
![img.png](img.png)

And ObjectMapper must register javaTimeModule

```
objectMapper.registerModule(new JavaTimeModule());
```

It shows that the zonedDateTime having been projected to UTC by default. So maybe the best is to write a custom DateTime
deserializer.

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

### Custom Deserializer

Instead of using JSR-310 to deserialize ZonedDateTime, it may be a good practice to create a custom deserializer and
applying it directly on the data model attribute without registering a JSR-310 JavaDateTimeModule within ObjectMapper.
By this way, Jackson can directly deserialize json string to ZonedDateTime instance.

```
    @JsonDeserialize(using = ZonedDateTimeDeserializer.class)
    private ZonedDateTime startTime;
```

Jackson leaves client an interface to carry out a custom deserializer.

```
public class ZonedDateTimeDeserializer extends JsonDeserializer<ZonedDateTime> {
    @Override
    public ZonedDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        return ZonedDateTime.parse(jsonParser.getText(), DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }
}
```

### References

https://www.baeldung.com/jackson-serialize-dates

https://www.baeldung.com/jackson-deserialization
