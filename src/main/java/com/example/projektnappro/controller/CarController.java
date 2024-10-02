package com.example.projektnappro.controller;

import ch.qos.logback.core.model.Model;
import com.example.projektnappro.Car;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

public class CarController {

    List<Car> cars = new ArrayList<String>();

    @GetMapping
    public String list(Model model){
        cars.add(new Car("ABC12", ));
    }
}
