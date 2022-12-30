package com.ynz.demo.jackson.model;


import lombok.Data;
import lombok.ToString;

import java.time.ZonedDateTime;

@Data
@ToString
public class User {
    private String name;
    private ZonedDateTime createdAt;
}
