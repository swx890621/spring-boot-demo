package com.duing.controller;

import com.duing.config.CarsConfig;
import com.duing.config.FoodConfig;
import com.duing.domain.Cars;
import com.duing.domain.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {
//    @Value("${food.rice}")
//    private String rice;
//    @Value("${food.meat}")
//    private String meat;
//    @Autowired
//    private FoodConfig foodConfig;
//    @RequestMapping("/json")
//    public Food json(){
//        Food food = new Food();
//        food.setMeat(foodConfig.getMeat());
//        food.setRice(foodConfig.getRice());
//
//        return food;
//    }
    @Autowired
    private CarsConfig carsConfig;

    @RequestMapping("/show")
    public Cars show(){
        Cars cars = new Cars();
        cars.setAudi(carsConfig.getAudi());
        cars.setBmw(carsConfig.getBmw());
        cars.setBz(carsConfig.getBz());
        return cars;
    }
}
