package com.ynz.demo.jackson.custom;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ynz.demo.jackson.custom.dto.Appointment;

import java.io.IOException;
import java.io.InputStream;

public class CustomDeserializer {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = CustomDeserializer.class.getResourceAsStream("/appointment.json");
        ObjectMapper objectMapper = new ObjectMapper();
        Appointment appointment = objectMapper.readValue(inputStream, Appointment.class);
        System.out.println(appointment);
    }
}
