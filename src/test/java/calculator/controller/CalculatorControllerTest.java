package calculator.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorControllerTest {
    private CalculatorController calculatorController = new CalculatorController();

    @Test
    void Calculate_positive_number_is_successful() {
        int[] arr = new int[]{
                1, 2, 3
        };

        int result = calculatorController.calculate(arr);

        Assertions.assertEquals(6, result);
    }

    @Test
    void Calculate_negative_number_throws_exception() {
        int[] arr = new int[]{
                -1, 2, 3
        };

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculatorController.calculate(arr);
        });
    }
}
