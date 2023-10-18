package com.example.junitcalc.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcServiceTest {
    private final String greetingMessage = "Добро пожаловать в калькулятор!";
    private final String divideByZeroMessage = "Divide by 0 exception!";
    private final int[] nabor1 = {5, 7};
    private final int[] nabor2 = {-99, -9900};
    private final int[] nabor3 = {999, 0};
    private final int[] nabor4 = {-18, 3};

    private final CalcService calcService = new CalcService();

    @Test
    public void greetingTest() {
        assertEquals(greetingMessage, calcService.greeting());
    }

    @Test
    public void plus_shouldReturnPositiveNumWhenNumbersArePositive() {
        String expectedResult1 = String.valueOf(nabor1[0] + nabor1[1]);
        String actualResult1 = calcService.plus(nabor1[0], nabor1[1]);
        assertEquals(expectedResult1, actualResult1);
    }

    @Test
    public void plus_shouldReturnNegativeNumWhenNumbersAreNegative() {
        String expectedResult2 = String.valueOf(nabor2[0] + nabor2[1]);
        String actualResult2 = calcService.plus(nabor2[0], nabor2[1]);
        assertEquals(expectedResult2, actualResult2);
    }

    @Test
    public void minus_shouldReturnPositiveWhenNum1BiggerThenNum2() {
        String expectedResult1 = String.valueOf(nabor2[0] - nabor2[1]);
        String actualResult1 = calcService.minus(nabor2[0], nabor2[1]);
        assertEquals(expectedResult1, actualResult1);
    }

    @Test
    public void minus_shouldReturnNegativeWhenNum1SmallerThenNum2() {
        String expectedResult2 = String.valueOf(nabor1[0] - nabor1[1]);
        String actualResult2 = calcService.minus(nabor1[0], nabor1[1]);
        assertEquals(expectedResult2, actualResult2);
    }

    @Test
    public void multiply_shouldReturnPositiveWhenNumbersHaveTheSameSign() {
        String expectedResult1 = String.valueOf(nabor1[0] * nabor1[1]);
        String actualResult1 = calcService.multiply(nabor1[0], nabor1[1]);
        assertEquals(expectedResult1, actualResult1);
    }

    @Test
    public void multiply_shouldReturnNegativeWhenNumbersHaveDifferentSigns() {
        String expectedResult2 = String.valueOf(nabor4[0] * nabor4[1]);
        String actualResult2 = calcService.multiply(nabor4[0], nabor4[1]);
        assertEquals(expectedResult2, actualResult2);
    }

    @Test
    public void divide_shouldReturnPositiveWhenNumbersHaveTheSameSign() {
        String expectedResult1 = String.valueOf((double) nabor1[0] / nabor1[1]);
        String actualResult1 = calcService.divide(nabor1[0], nabor1[1]);
        assertEquals(expectedResult1, actualResult1);
    }

    @Test
    public void divide_shouldReturnNegativeWhenNumbersHaveDifferentSigns() {
        String expectedResult2 = String.valueOf((double) nabor4[0] / nabor4[1]);
        String actualResult2 = calcService.divide(nabor4[0], nabor4[1]);
        assertEquals(expectedResult2, actualResult2);
    }

    @Test
    public void divide_shouldReturnExceptionWithMessage() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> calcService.divide(nabor3[0], nabor3[1]));
        assertEquals(divideByZeroMessage, exception.getMessage());
    }
}
