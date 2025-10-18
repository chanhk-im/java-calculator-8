package calculator.view;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.function.Consumer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserViewTest {
    private UserView userView = new UserView();
    private ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void UserView_show_input_message() {
        userView.showInputMessage();
        Assertions.assertEquals("합계를 구할 숫자를 입력하세요.", outputStream.toString().trim());
    }

    @Test
    void UserView_show_result() {
        int result = 6;

        userView.showResult(result);

        Assertions.assertEquals("결과 : 6", outputStream.toString().trim());
    }
}
