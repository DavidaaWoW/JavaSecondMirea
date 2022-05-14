package ru.mirea.fourteenth;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Author {
    private String firstName;
    private String lastName;
    private String middleName;
    private String birthDate;

    public Author(String firstName, String lastName, String middleName, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birthDate = birthDate;
    }

}
