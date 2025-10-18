package calculator.utils;

import java.util.ArrayList;
import java.util.List;

public class InputValidator {
    public boolean hasDelimiter(String input) {
        return input.charAt(0) == '/' && input.charAt(1) == '/' && input.contains("\\n");
    }

    public boolean hasNumberDelimiter(String header) {
        for (char ch : header.toCharArray()) {
            if (Character.isDigit(ch)) {
                return true;
            }
        }

        return false;
    }

    public boolean checkValidate(String input) {
        List<Character> delimiters = new ArrayList<Character>();
        String content;

        if (hasDelimiter(input)) {
            int delimiterEndIndex = input.indexOf("\\n");
            String header = input.substring(2, delimiterEndIndex);

            if (hasDelimiter(header) || hasNumberDelimiter(header)) {
                return false;
            }

            for (char ch : header.toCharArray()) {
                delimiters.add(ch);
            }

            content = input.substring(delimiterEndIndex + 2);
        } else {
            delimiters.add(',');
            delimiters.add(':');

            content = input;
        }

        for (char ch : content.toCharArray()) {
            if (!Character.isDigit(ch) && !delimiters.contains(ch)) {
                return false;
            }
        }

        return true;
    }
}
