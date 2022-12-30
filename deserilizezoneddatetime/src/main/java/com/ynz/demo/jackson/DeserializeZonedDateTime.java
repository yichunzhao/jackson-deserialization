package com.ynz.demo.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.ynz.demo.jackson.model.User;

public class DeserializeZonedDateTime {

    private static final String jsonString = "{\n" +
            "  \"name\": \"test_1f5374568a05\",\n" +
            "  \"createdAt\": \"2017-03-22T06:45:56.284+01:00\"\n" +
            "}";

    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        User user = objectMapper.readValue(jsonString, User.class);
        System.out.println(user);
    }
}
