package calculator.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InputParserTest {
    private InputParser inputParser = new InputParser();

    @Test
    void Parse_default_input() {
        String input = "1,2:3";

        int[] result = inputParser.parseString(input);

        Assertions.assertArrayEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    void Parse_input_with_one_delimiter() {
        String input = "//;\\n1;2;3";

        int[] result = inputParser.parseString(input);

        Assertions.assertArrayEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    void Parse_input_with_delimiters() {
        String input = "//;!@\\n1;2!3@4,5";

        int[] result = inputParser.parseString(input);

        Assertions.assertArrayEquals(new int[]{1, 2, 3, 45}, result);
    }
}
