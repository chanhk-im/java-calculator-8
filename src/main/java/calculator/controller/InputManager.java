package calculator.controller;

import calculator.utils.InputValidator;
import camp.nextstep.edu.missionutils.Console;

public class InputManager {
    private InputValidator inputValidator;

    public InputManager() {
        inputValidator = new InputValidator();
    }

    public String inputString() {
        String input = Console.readLine();

        Console.close();

        if (!inputValidator.checkValidate(input)) {

            throw new IllegalArgumentException("올바르지 않은 입력입니다.");
        }

        return input;
    }
}
