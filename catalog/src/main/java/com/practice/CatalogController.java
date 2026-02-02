package com.practice.catalog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
public class CatalogController {

    @GetMapping("/catalog/products")
    public List<Map<String, Object>> getProducts() {
        return List.of(
            Map.of("id", 1, "name", "Laptop", "price", 900),
            Map.of("id", 2, "name", "Phone", "price", 500)
        );
    }
}
