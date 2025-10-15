package calculator.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SeperatorTest {
    private Seperator seperator = new Seperator();

    @Test
    void Seperate_with_one_delimiter() {
        String inputData = "1;2;3";
        List<Character> delimiter = Arrays.asList(';');

        int[] result = seperator.seperate(delimiter, inputData);

        Assertions.assertArrayEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    void Seperate_with_two_delimiters() {
        String inputData = "1,2:3!4";
        List<Character> delimiter = Arrays.asList(',', ':');

        int[] result = seperator.seperate(delimiter, inputData);

        Assertions.assertArrayEquals(new int[]{1, 2, 34}, result);
    }
}
