package calculator.controller;

import calculator.service.CalculatorService;

public class CalculatorController {
    private CalculatorService calculatorService;

    public CalculatorController() {
        this.calculatorService = new CalculatorService();
    }

    public int calculate(int[] numbers) {
        return calculatorService.calculate(numbers);
    }
}
