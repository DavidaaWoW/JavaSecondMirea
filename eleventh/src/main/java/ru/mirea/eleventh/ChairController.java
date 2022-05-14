package ru.mirea.eleventh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ChairController {
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/chair")
    public Chair chair(@RequestParam(value = "price", defaultValue = "0") String price, @RequestParam(value = "type", defaultValue = "0") String name ){
        return new Chair(counter.incrementAndGet(), Long.parseLong(price), name);
    }
    //http://localhost:8080/chair
}
