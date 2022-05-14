package ru.mirea.eleventh;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Chair {
    private long id;
    private double price;
    private String type;

    public Chair(long id, double price, String type) {
        this.id = id;
        this.price = price;
        this.type = type;
    }
}
