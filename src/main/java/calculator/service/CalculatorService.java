package calculator.service;

public class CalculatorService {
    public int calculate(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            if (number < 0) {
                throw new IllegalArgumentException("양수를 입력해야 합니다.");
            }

            result += number;
        }

        return result;
    }
}
