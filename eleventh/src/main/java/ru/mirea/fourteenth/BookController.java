package ru.mirea.fourteenth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.mirea.twelfth.Main;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;

@RestController
public class BookController {
    Path path = Path.of("C:\\Users\\User\\Desktop\\eleventh\\src\\main\\java\\ru\\mirea\\fourteenth\\books.txt");
    File file = new File("C:\\Users\\User\\Desktop\\eleventh\\src\\main\\java\\ru\\mirea\\fourteenth\\books.txt");
    private static Logger LOG = LoggerFactory
            .getLogger(Main.class);
    @GetMapping("/book")
    public String bookGet(@RequestParam(value = "name", defaultValue = "null") String name, @RequestParam(value = "all", defaultValue = "false") String all){
        String list = "";
        try {
            HashSet set = new HashSet(Files.readAllLines(path));
            for (Object k: set
                 ) {
                list+=(k.toString());
                list += "\n";
                if(all == "false") {
                    if (k.toString().contains(name)) {
                        return k.toString();
                    }
                }
            }
            if(all.equals("true")){
                return list;
            }
            return "null";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @PostMapping("/book")
    public String bookPost(@RequestParam(value = "name", defaultValue = "null") String name, @RequestParam(value = "creationDate", defaultValue = "null") String creationDate){
        try {
            FileWriter writer = new FileWriter(file, true);
            Book book = new Book(name, creationDate);
            writer.write(book.toString() + "\n");
            writer.flush();
            return "Success!";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error!";
        }
    }

    @DeleteMapping("/book")
    public String bookDel(@RequestParam(value = "name", defaultValue = "null") String name){
        if(name == "null"){
            return "null";
        }

        try {
            HashSet set = new HashSet(Files.readAllLines(path));
            ArrayList <String> list = new ArrayList<>();
            for (Object k: set
            ) {
                if(k.toString().contains(name)){
                    continue;
                }
                list.add(k.toString());
            }
            try {
                FileWriter writer = new FileWriter(file, false);
                for (String k: list
                     ) {
                    writer.write(k + "\n");
                }
                writer.flush();
                return "Success!";
            } catch (IOException e) {
                e.printStackTrace();
                return "Error!";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
