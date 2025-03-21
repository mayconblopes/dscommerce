package com.mike.dscommerce;

import com.mike.dscommerce.entities.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DscommerceApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void newUserTest() {
        User user = new User();
        User mike = new User(1L, "Mike the Mike", "mike@gmail.com",
                "+5599999999", LocalDate.of(2000, 5, 25), "123456");

        assertEquals(1, mike.getId());
        assertEquals("Mike the Mike", mike.getName());
        assertEquals("mike@gmail.com", mike.getEmail());
        assertEquals("+5599999999", mike.getPhone());
        assertEquals(LocalDate.of(2000, 5, 25), mike.getBirgDate());
        assertEquals("123456", mike.getPassword());
    }

}
