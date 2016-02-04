package es.rvindel.tdd.kata;

import java.util.Arrays;

public class CoreStringSplitter implements StringSplitter {

    private static final String CUSTOM_SEPARATOR_START_HEADING = "//";
    private static final int CUSTOM_SEPARATOR_POSITION = 2;
    private static final int CUSTOM_SEPARATOR_HEADING_LENGTH = 4;
    private static final String DEFAULT_SEPARATORS = ",|\n";

    @Override
    public int[] split(String numbers) {
        if(!numbers.isEmpty()) {
            return Arrays.stream(processNumbers(numbers).split(obtainSeparators(numbers)))
                    .mapToInt(number -> Integer.parseInt(number))
                    .toArray();
        }

        return new int[] {};
    }

    private String obtainSeparators(String numbers) {
        if(numbers.startsWith(CUSTOM_SEPARATOR_START_HEADING)) {
            return String.valueOf(numbers.charAt(CUSTOM_SEPARATOR_POSITION));
        }
        return DEFAULT_SEPARATORS;
    }

    private String processNumbers(String numbers) {
        if(numbers.startsWith(CUSTOM_SEPARATOR_START_HEADING)) {
            return numbers.substring(CUSTOM_SEPARATOR_HEADING_LENGTH);
        }
        return numbers;
    }
}
