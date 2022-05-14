package ru.mirea.twelfth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;

@SpringBootApplication
public class Main implements CommandLineRunner {
    private static Logger LOG = LoggerFactory
            .getLogger(Main.class);

    public static void main(String[] args)  {
        LOG.info("STARTING THE APPLICATION");
        SpringApplication.run(Main.class, args);
        LOG.info("APPLICATION FINISHED");
    }


    @Override
    public void run(String... args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Controller controller = context.getBean(Controller.class);
        controller.init();
        controller.doMagic(args);
    }
}
