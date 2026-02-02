package com.practice.inventory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class InventoryController {

    @GetMapping("/inventory/stock")
    public Map<Integer, Integer> getStock() {
        return Map.of(
            1, 10,  // Laptop stock
            2, 25   // Phone stock
        );
    }
}
