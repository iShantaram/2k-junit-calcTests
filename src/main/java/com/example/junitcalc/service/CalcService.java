package com.example.junitcalc.service;

import org.springframework.stereotype.Service;

@Service
public class CalcService {
    public final String greetingMessage = "Добро пожаловать в калькулятор!";
    public final String divideByZeroMessage = "Divide by 0 exception!";
    public String greeting() {
        return greetingMessage;
    }
    public String plus(Integer num1, Integer num2) {
        return String.valueOf(num1 + num2);
    }

    public String minus(Integer num1, Integer num2) {
        return String.valueOf(num1 - num2);
    }

    public String multiply(Integer num1, Integer num2) {
        return String.valueOf(num1 * num2);
    }

    public String divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException(divideByZeroMessage);
        }
        return String.valueOf((double) num1 / num2);
    }
}
