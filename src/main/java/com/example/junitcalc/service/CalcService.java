package com.example.junitcalc.service;

import org.springframework.stereotype.Service;

@Service
public class CalcService {
    public String greeting() {
        return "Добро пожаловать в калькулятор!";
    }
    public Integer plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    public Integer minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    public Double divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Divide by 0!");
        }
        return (double) num1 / num2;
    }
}
