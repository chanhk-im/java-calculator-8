package calculator.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SeperatorTest {
    private Seperator seperator = new Seperator();

    @Test
    void Seperate_with_one_delimiter() {
        String inputData = "1;2;3";
        char[] delimiter = new char[]{';'};

        int[] result = seperator.seperate(delimiter, inputData);

        Assertions.assertArrayEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    void Seperate_with_two_delimiters() {
        String inputData = "1,2:3!4";
        char[] delimiter = new char[]{',', ':'};

        int[] result = seperator.seperate(delimiter, inputData);

        Assertions.assertArrayEquals(new int[]{1, 2, 34}, result);
    }
}
