package com.ynz.demo.jackson.custom.dto;

import lombok.Data;
import lombok.ToString;

import java.time.ZonedDateTime;

@Data
@ToString
public class Appointment {
    private Long id;
    private ZonedDateTime startTime;
}
