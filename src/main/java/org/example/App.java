package org.example;

import org.example.dto.Cat;
import org.example.service.CatService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.retry.annotation.EnableRetry;

import static org.springframework.boot.SpringApplication.run;

@EnableRetry
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = run(App.class, args);
        CatService catService = context.getBean(CatService.class);
        System.out.println("--------");
        Cat cat = catService.getCat("仔仔");
        System.out.println(cat);
    }
}
