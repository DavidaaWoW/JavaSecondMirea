package ru.mirea.twelfth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;

@Component
public class Controller {
    private static Logger LOG = LoggerFactory
            .getLogger(Main.class);
    public void doMagic(String[] args) {
        String one = "C:\\Users\\User\\Desktop\\eleventh\\src\\main\\java\\ru\\mirea\\twelfth\\" + args[0];
        String two = "C:\\Users\\User\\Desktop\\eleventh\\src\\main\\java\\ru\\mirea\\twelfth\\" + args[1];
        FileWriter writer = null;
        File file = new File(two);
        try {
            writer = new FileWriter(file, false);
        }
        catch (Exception ex){
            LOG.info(ex.getMessage());
        }
        try (FileReader reader = new FileReader(one)){
            Path path = Path.of(one);
            HashSet set = new HashSet(Files.readAllLines(path));
            for (Object k: set
            ) {
                LOG.info(k.toString());
                writer.write(k.toString());
                writer.write("\n");
            }
            writer.flush();
        }
        catch (Exception ex){
            try {
                writer.write("NULL");
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @PostConstruct
    public void init(){
        LOG.info("Controller is ready!");
    }
}
