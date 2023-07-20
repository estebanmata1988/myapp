package com.currency.exchanger.controller;

import com.currency.exchanger.entities.CarDetails;
import com.currency.exchanger.entities.CarForm;
import com.currency.exchanger.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class CarController {

    @Autowired
    CarService carService;

    @PostMapping("/currencyExchanger")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<CarDetails> exchangeCarPrice(@RequestBody CarForm carForm) {
        return carService.getNewCarCurrency(carForm);
    }

    @PostMapping("/buyCar")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<CarDetails> buyCar(@RequestBody CarForm carForm) {
        return carService.buyNewCar(carForm);
    }

    @PostMapping("/report")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<CarDetails> reportCarDetails(@RequestBody CarForm carForm) {
        return carService.getReport(carForm);
    }
}
