package com.example.junitcalc.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcServiceTest {
    private final String greetingMessage = "Добро пожаловать в калькулятор!";
    private final String divideByZeroMessage = "Divide by 0 exception!";
    private final int[] nabor1 = {5, 7};
    private final int[] nabor2 = {999999, 999};
    private final int[] nabor3 = {999, 0};

    private final CalcService calcService = new CalcService();

    @Test
    public void greetingTest() {
        assertEquals(greetingMessage, calcService.greeting());
    }

    @Test
    public void plusTest() {
        String expectedResult1 = String.valueOf(nabor1[0] + nabor1[1]);
        String actualResult1 = calcService.plus(nabor1[0], nabor1[1]);
        assertEquals(expectedResult1, actualResult1);

        String expectedResult2 = String.valueOf(nabor2[0] + nabor2[1]);
        String actualResult2 = calcService.plus(nabor2[0], nabor2[1]);
        assertEquals(expectedResult2, actualResult2);
    }

    @Test
    public void minusTest() {
        String expectedResult1 = String.valueOf(nabor1[0] - nabor1[1]);
        String actualResult1 = calcService.minus(nabor1[0], nabor1[1]);
        assertEquals(expectedResult1, actualResult1);

        String expectedResult2 = String.valueOf(nabor2[0] - nabor2[1]);
        String actualResult2 = calcService.minus(nabor2[0], nabor2[1]);
        assertEquals(expectedResult2, actualResult2);
    }

    @Test
    public void multiplyTest() {
        String expectedResult1 = String.valueOf(nabor1[0] * nabor1[1]);
        String actualResult1 = calcService.multiply(nabor1[0], nabor1[1]);
        assertEquals(expectedResult1, actualResult1);

        String expectedResult2 = String.valueOf(nabor2[0] * nabor2[1]);
        String actualResult2 = calcService.multiply(nabor2[0], nabor2[1]);
        assertEquals(expectedResult2, actualResult2);
    }

    @Test
    public void divideTest() {
        String expectedResult1 = String.valueOf((double) nabor1[0] / nabor1[1]);
        String actualResult1 = calcService.divide(nabor1[0], nabor1[1]);
        assertEquals(expectedResult1, actualResult1);

        String expectedResult2 = String.valueOf((double) nabor2[0] / nabor2[1]);
        String actualResult2 = calcService.divide(nabor2[0], nabor2[1]);
        assertEquals(expectedResult2, actualResult2);

        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> calcService.divide(nabor3[0], nabor3[1]));
        assertEquals(divideByZeroMessage, exception.getMessage());
    }
}
