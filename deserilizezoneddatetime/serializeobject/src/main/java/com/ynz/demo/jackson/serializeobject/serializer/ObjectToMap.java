package com.ynz.demo.jackson.serializeobject.serializer;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class ObjectToMap {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static Map<String, ?> convert(Object object) {
        return objectMapper.convertValue(object, new TypeReference<Map<String, ?>>() {
        });
    }
}
