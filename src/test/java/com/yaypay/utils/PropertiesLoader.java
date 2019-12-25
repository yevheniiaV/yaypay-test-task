package com.yaypay.utils;

import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {

    private Properties properties;

    public PropertiesLoader(String fromResource) throws IOException {
        properties = new Properties();
        properties.load(PropertiesLoader.class.getResourceAsStream(fromResource));
    }

    public boolean hasProperty(String name) {
        return properties.containsKey(name);
    }

    public String getProperty(String name) {
        return properties.getProperty(name);
    }
}
