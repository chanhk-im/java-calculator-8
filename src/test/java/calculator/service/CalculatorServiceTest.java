package calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {
    private CalculatorService calculatorService = new CalculatorService();

    @Test
    void Calculate_positive_number_is_successful() {
        int[] arr = new int[]{
                1, 2, 3
        };

        int result = calculatorService.calculate(arr);

        Assertions.assertEquals(6, result);
    }

    @Test
    void Calculate_negative_number_throws_exception() {
        int[] arr = new int[]{
                -1, 2, 3
        };

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculatorService.calculate(arr);
        });
    }
}
