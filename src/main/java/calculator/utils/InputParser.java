package calculator.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputParser {
    private Seperator seperator;

    public InputParser() {
        seperator = new Seperator();
    }

    public boolean hasDelimiter(String input) {
        if (input.charAt(0) == '/' && input.charAt(1) == '/' && input.contains("\\n")) {
            return true;
        }

        return false;
    }

    public int[] parseString(String input) {
        if (hasDelimiter(input)) {
            int delimiterEndIndex = input.indexOf("\\n");
            List<Character> delimiters = new ArrayList<>();

            for (int i = 2; i < delimiterEndIndex; i++) {
                delimiters.add(input.charAt(i));
            }

            String content = input.substring(delimiterEndIndex + 1);

            return seperator.seperate(delimiters, content);
        }

        return seperator.seperate(Arrays.asList(',', ':'), input);
    }
}
