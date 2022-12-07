package com.duing.controller;

import com.duing.food.Food;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {
    @Value("${food.rice}")
    private String rice;
    @Value("${food.meat}")
    private String meat;

    @RequestMapping("/json")
    public Food json(){
        Food food = new Food();
        food.setMeat(meat);
        food.setRice(rice);

        return food;
    }
}
