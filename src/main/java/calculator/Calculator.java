package calculator;

import calculator.controller.CalculatorController;
import calculator.controller.InputManager;
import calculator.utils.InputParser;
import calculator.view.UserView;

public class Calculator {
    private InputManager inputManager;
    private InputParser inputParser;
    private CalculatorController controller;
    private UserView view;

    public Calculator() {
        inputManager = new InputManager();
        inputParser = new InputParser();
        controller = new CalculatorController();
        view = new UserView();
    }

    public void start() {
        view.showInputMessage();
        String input = inputManager.inputString();

        int[] numbers = inputParser.parseString(input);

        int result = controller.calculate(numbers);

        view.showResult(result);
    }
}
