package ru.mirea.fourteenth;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Book {
    private String name;
    private String creationDate;

    public Book(String name, String creationDate) {
        this.name = name;
        this.creationDate = creationDate;
    }
}
