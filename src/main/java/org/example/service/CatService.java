package org.example.service;

import org.example.dto.Cat;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CatService {
    @Retryable(maxAttempts = 3)
    public Cat getCat(String name) {
        System.out.println("-- do --");
        throw new RuntimeException();
//        Random rand = new Random();
//        double v = rand.nextDouble();
//        if (v > 0.5) {
//            throw new RuntimeException();
//        }
//        Cat cat = new Cat();
//        cat.name = name;
//        return cat;
    }
}
