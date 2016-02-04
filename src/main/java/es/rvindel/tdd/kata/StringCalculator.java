package es.rvindel.tdd.kata;

import java.util.Arrays;

public class StringCalculator {

    public int add(String numbers) {
        if(!numbers.isEmpty()) {
            final String[] numbersArray = stringSplitter.split(numbers);
            return Arrays.asList(numbersArray)
                    .stream()
                    .mapToInt(number -> Integer.parseInt(number))
                    .sum();
        }

        return 0;
    }
}
