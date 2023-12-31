package com.example.junitcalc.controller;

import com.example.junitcalc.service.CalcService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalcController {
    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public String greeting() {
        return calcService.greeting();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam Integer num1, Integer num2) {
        return num1 + " + " + num2 + " = " + calcService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam Integer num1, Integer num2) {
        return num1 + " - " + num2 + " = " + calcService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam Integer num1, Integer num2) {
        return num1 + " * " + num2 + " = " + calcService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam Integer num1, Integer num2) {
        return num1 + " / " + num2 + " = " + calcService.divide(num1, num2);
    }
}
