package es.rvindel.tdd.kata;

import java.util.Arrays;

public class StringCalculator {

    private final StringSplitter stringSplitter;

    public StringCalculator(StringSplitter stringSplitter) {
        this.stringSplitter = stringSplitter;
    }

    public int add(String numbers) {
        if(!numbers.isEmpty()) {
            final int[] numbersArray = stringSplitter.split(numbers);
            return Arrays
                    .stream(numbersArray)
                    .sum();
        }

        return 0;
    }
}
