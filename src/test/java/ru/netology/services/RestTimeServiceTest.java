package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


class RestTimeServiceTest {

    @ParameterizedTest
//    @CsvSource({
//            "3, 10000, 3000, 20000",
//            "2, 100000, 60000, 150000"
//    })
    @CsvFileSource(files = "src/test/resources/data.csv")
    public void restTimeTrackingTest(int expected, int income, int expenses, int threshold) {
        RestTimeService service = new RestTimeService();

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}