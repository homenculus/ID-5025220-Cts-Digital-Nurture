package com.example.bookstore;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
public class BookStoreIntegrationTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    @Sql(scripts = "/test-data.sql")
    public void testDatabaseConnection() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/test/db-connection"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Database connection is successful!"));
    }
}
