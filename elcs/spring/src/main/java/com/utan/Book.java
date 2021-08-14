package com.utan;

import org.springframework.stereotype.Component;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
@Component
public class Book {
    private String name;

    public Book() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
