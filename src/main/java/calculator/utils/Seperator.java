package calculator.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Seperator {
    public int[] seperate(List<Character> delimiters, String string) {
        ArrayList<Integer> list = new ArrayList<>();

        int currNumber = 0;
        for (char c : string.toCharArray()) {
            if (delimiters.contains(c)) {
                list.add(currNumber);
                currNumber = 0;
            } else if (Character.isDigit(c)) {
                currNumber = currNumber * 10 + Character.getNumericValue(c);
            }
        }

        if (currNumber != 0) {
            list.add(currNumber);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
