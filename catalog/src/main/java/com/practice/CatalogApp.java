package com.practice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class CatalogApp {
    public static void main(String[] args) { SpringApplication.run(CatalogApp.class, args); }

    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable String id) {
        return (id.equals("1")) ? "iPhone 15" : "Generic Smartphone";
    }
}
