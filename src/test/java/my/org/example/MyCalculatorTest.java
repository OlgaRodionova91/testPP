package my.org.example;

import org.example.Calc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MyCalculatorTest {

    @ParameterizedTest(name = "#{index} - сложение {0} + {1}, ожидаем {2}")
    @DisplayName("Проверка суммирования")
    @CsvSource({"1, 2, 3", "3, 4, 7", "-1, 0, -1"})
    void summ( int a, int b, int expectedResult) {
            Calc MyCalculator = new Calc();
            int result = MyCalculator.summ(a,b);
            Assertions.assertEquals(expectedResult, result, "Не тот ответ");
    }

    @ParameterizedTest(name = "#{index} - вычитание {0} - {1}, ожидаем {2}")
    @DisplayName("Проверка вычитания")
    @CsvSource({"2, 1, 1", "5, 3, 2", "7, 4, 3"})
    void minus( int a, int b, int expectedResult) {
        Calc MyCalculator = new Calc();
        int result = MyCalculator.minus(a,b);
        Assertions.assertEquals(expectedResult, result, "Не тот ответ");
    }
}