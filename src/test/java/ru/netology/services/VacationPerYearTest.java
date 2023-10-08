package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationPerYearTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/test.csv")
//    @CsvSource({
//            "3,10_000,3_000,20_000",
//            "2,100_000,60_000,150_000",
//            "1,5_000,4_000,7_000"
//    })
    public void calculationOfVacationDaysWithCorrectData(int expected, int income, int expenses, int theshold) {
        VacationPerYear service = new VacationPerYear();

        int actual = service.calculate(income, expenses, theshold);

        Assertions.assertEquals(expected, actual);

    }

//    @Test
//    public void calculationOfVacationDaysWithCorrectData1() {
//        VacationPerYear service = new VacationPerYear();
//
//        int expected = 3;
//        int actual = service.calculate(10_000, 3_000, 20_000);
//
//        Assertions.assertEquals(expected, actual);
//
//    }

}
