package com.ynz.demo.jackson.custom.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.ynz.demo.jackson.custom.deserializer.ZonedDateTimeDeserializer;
import lombok.Data;
import lombok.ToString;

import java.time.ZonedDateTime;

@Data
@ToString
public class Appointment {
    private Long id;
    @JsonDeserialize(using = ZonedDateTimeDeserializer.class)
    private ZonedDateTime startTime;
}
