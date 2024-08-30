package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StoreController {
    @GetMapping("/store")
    public Map<String, String> getStore() {
        Map<String, String> store = new HashMap<>();
        store.put("id", "1");
        store.put("name", "My Store");
        store.put("address", "123 Main St");
        return store;
    }
}

