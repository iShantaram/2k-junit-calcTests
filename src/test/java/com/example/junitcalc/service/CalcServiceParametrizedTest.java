package com.example.junitcalc.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcServiceParametrizedTest {

    CalcService calcService = new CalcService();

    @ParameterizedTest
    @CsvSource(
            {
                    "2, 4, 6",
                    "32, 4, 36",
                    "0, 2, 2"
            }
    )
    void plus(int num1, int num2, int result) {
        String expectedResult = String.valueOf(result);

        String actualResult = calcService.plus(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource(
            {
                    "2, 4, -2",
                    "32, 4, 28",
                    "0, 2, -2"
            }
    )
    void minus(int num1, int num2, int result) {
        String expectedResult = String.valueOf(result);

        String actualResult = calcService.minus(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource(
            {
                    "2, 4, 8",
                    "32, 4, 128",
                    "0, 2, 0"
            }
    )
    void multiply(int num1, int num2, int result) {
        String expectedResult = String.valueOf(result);

        String actualResult = calcService.multiply(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource(
            {
                    "2, 4, 0.5",
                    "32, 4, 8",
                    "0, 2, 0"
            }
    )
    void divide(int num1, int num2, double result) {
        String expectedResult = String.valueOf(result);

        String actualResult = calcService.divide(num1, num2);

        assertEquals(expectedResult, actualResult);
    }
}