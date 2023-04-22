package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.services.VacationService;

public class VacationServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/vacationCount.csv")
    public void countVacationsMonth(int expected, int income, int expenses, int threshold) {
        VacationService service = new VacationService();

//        int expected = 3;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void countVacationsMonthIfThreshold150_000() {
//        VacationService service = new VacationService();
//
//        int expected = 2;
//        int actual = service.calculate(100_000, 60_000, 150_000);
//
//        Assertions.assertEquals(expected, actual);
//    }

}
