package com.example.bookstore_security;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UrlConnectionTest {

    private static final String TEST_URL = "http://localhost:3000"; 

    @Test
    public void testUrlConnection() {
        HttpURLConnection connection = null;
        try {
            URL url = new URL(TEST_URL);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("8080"); 

            int responseCode = connection.getResponseCode();

           
            assertEquals(200, responseCode, "Expected response code 200 but got " + responseCode);
        } catch (IOException e) {
            e.printStackTrace();
          
            throw new RuntimeException("Failed to connect to URL", e);
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}
