package ru.mirea.fourteenth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import ru.mirea.twelfth.Main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;

@RestController
public class AuthorController {
    Path path = Path.of("C:\\Users\\User\\Desktop\\eleventh\\src\\main\\java\\ru\\mirea\\fourteenth\\authors.txt");
    File file = new File("C:\\Users\\User\\Desktop\\eleventh\\src\\main\\java\\ru\\mirea\\fourteenth\\authors.txt");
    private static Logger LOG = LoggerFactory
            .getLogger(Main.class);
    @GetMapping("/author")
    public String authorGet(@RequestParam(value = "firstName", defaultValue = "null") String name, @RequestParam(value = "all", defaultValue = "false") String all){
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

    @PostMapping("/author")
    public String authorPost(@RequestParam(value = "firstName", defaultValue = "null") String firstName, @RequestParam(value = "lastName", defaultValue = "null") String lastName, @RequestParam(value = "middleName", defaultValue = "null") String middleName, @RequestParam(value = "birthDate", defaultValue = "null") String birthDate){
        try {
            FileWriter writer = new FileWriter(file, true);
            Author author = new Author(firstName, lastName, middleName, birthDate);
            writer.write(author.toString() + "\n");
            writer.flush();
            return "Success!";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error!";
        }
    }

    @DeleteMapping("/author")
    public String bookDel(@RequestParam(value = "name", defaultValue = "null") String name){
        if(name == "null"){
            return "null";
        }

        try {
            HashSet set = new HashSet(Files.readAllLines(path));
            ArrayList<String> list = new ArrayList<>();
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
