package calculator;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator = new Calculator();
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void Calculator_run_successful() {
        String input = "//;!@\\n1;2!3";
        String expected = "덧셈할 문자열을 입력해 주세요.\n결과 : 6";

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        calculator.start();

        Assertions.assertEquals(expected.replaceAll("\\R", "\n"),
                outputStream.toString().trim().replaceAll("\\R", "\n"));
    }
}
