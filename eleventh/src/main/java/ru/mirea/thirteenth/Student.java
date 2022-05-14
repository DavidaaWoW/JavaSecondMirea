package ru.mirea.thirteenth;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Student {
    @Value("Davit")
    private String name;
    @Value("Gegia")
    private String last_name;
    @Value("IKBO-10-20")
    private String group;

    @PostConstruct
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", group='" + group + '\'' +
                '}';
    }


}
