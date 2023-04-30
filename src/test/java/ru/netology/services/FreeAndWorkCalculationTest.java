
package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FreeAndWorkCalculationTest {

    @Test
    public void firstCalcFreeWork() {
        FreeAndWorkCalculation service = new FreeAndWorkCalculation();

        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expected = 3;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void twoCalcFreeWork() {
        FreeAndWorkCalculation service = new FreeAndWorkCalculation();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expected = 2;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "10000, 3000, 20000, 3",
            "100000, 60000, 150000, 2"
    })
    public void calcFreeWork(int income, int expenses, int threshold, int expected) {
        FreeAndWorkCalculation service = new FreeAndWorkCalculation();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

}