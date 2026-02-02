package com.practice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class InventoryApp {
    public static void main(String[] args) { SpringApplication.run(InventoryApp.class, args); }

    @GetMapping("/stock/{id}")
    public String getStock(@PathVariable String id) {
        return "In Stock (10 units)";
    }
}
