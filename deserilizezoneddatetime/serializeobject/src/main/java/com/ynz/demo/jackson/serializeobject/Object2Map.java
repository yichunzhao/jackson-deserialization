package com.ynz.demo.jackson.serializeobject;

import com.ynz.demo.jackson.serializeobject.dataobject.Provider;
import com.ynz.demo.jackson.serializeobject.serializer.ObjectToMap;
import lombok.SneakyThrows;
import org.apache.commons.collections4.MapUtils;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.UUID;

public class Object2Map {

    @SneakyThrows
    public static void main(String[] args) {
        Provider provider = new Provider();
        provider.setProviderName("providerName");
        provider.setProviderState("active");
        provider.setRemoteModified(ZonedDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
        provider.setRemoteProviderId(UUID.randomUUID().toString());
        Map<String, ?> map = ObjectToMap.convert(provider);
        MapUtils.verbosePrint(System.out, "Map", map);
    }
}
