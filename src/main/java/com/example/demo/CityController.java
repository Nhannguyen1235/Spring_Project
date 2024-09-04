package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {
    private String cityName = "Ho Chi Minh City";
    private int cityCode = 59;
    private int numberDist = 21;

    @GetMapping("/city")
    public City city(@RequestParam(value = "cityName", defaultValue = "Ho Chi Minh City") String cityName) {
        return new City(String.format(cityName), cityCode, numberDist);
    }
}
