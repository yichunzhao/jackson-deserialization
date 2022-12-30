package com.ynz.demo.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.ynz.demo.jackson.model.User;

import java.io.IOException;
import java.io.InputStream;

public class DeserializeZonedDateTime {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = DeserializeZonedDateTime.class.getResourceAsStream("/user.json");

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        User user = objectMapper.readValue(inputStream, User.class);
        System.out.println(user);
    }
}
