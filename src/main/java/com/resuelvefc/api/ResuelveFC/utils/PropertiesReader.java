package com.resuelvefc.api.ResuelveFC.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {

    public static Properties getProperties(String name) throws IOException {
        InputStream input = null;
        Properties properties = null;
        try   {
            input = new FileInputStream("src/main/resources/" + name + ".properties");
            properties = new Properties();

            properties.load(input);


        } catch (IOException ex) {
            ex.printStackTrace();
        } finally  {
            input.close();
        }
        return properties;
    }
}