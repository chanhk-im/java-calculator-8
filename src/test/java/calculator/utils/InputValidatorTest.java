package calculator.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InputValidatorTest {
    private InputValidator validator = new InputValidator();

    @Test
    void Validate_successful() {
        String input = "//;!@\\n1;2!3";

        boolean result = validator.checkValidate(input);

        Assertions.assertTrue(result);
    }

    @Test
    void Validate_no_newline_failure() {
        String input = "//;!@1;2!3";

        boolean result = validator.checkValidate(input);

        Assertions.assertFalse(result);
    }

    @Test
    void Validate_number_delimiter_failure() {
        String input = "//;3!@\\n1;2!3";

        boolean result = validator.checkValidate(input);

        Assertions.assertFalse(result);
    }

    @Test
    void Validate_wrong_delimiter_failure() {
        String input = "//;!@\\n1#2!3";

        boolean result = validator.checkValidate(input);

        Assertions.assertFalse(result);
    }
}
