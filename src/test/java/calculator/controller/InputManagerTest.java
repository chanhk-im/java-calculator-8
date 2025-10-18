package calculator.controller;

import java.io.ByteArrayInputStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InputManagerTest {
    private InputManager inputManager = new InputManager();

    @Test
    void Input_Manager_input_string_successful() {
        String input = "//;!@\n1;2!3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Assertions.assertDoesNotThrow(() -> inputManager.inputString());
    }

    @Test
    void Input_Manager_input_string_throws_error() {
        String input = "//;!@\n1;2,3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            inputManager.inputString();
        });
    }
}
