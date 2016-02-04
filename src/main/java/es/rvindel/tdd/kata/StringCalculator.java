package es.rvindel.tdd.kata;

import java.util.Arrays;

public class StringCalculator {

    private final StringSplitter stringSplitter;

    public StringCalculator(StringSplitter stringSplitter) {
        this.stringSplitter = stringSplitter;
    }

    public int add(String numbers) throws NegativeNumberException {
        if(!numbers.isEmpty()) {
            final int[] numbersArray = stringSplitter.split(numbers);
            int sum = 0;
            for(int number : numbersArray) {
                if(number < 0) {
                    throw new NegativeNumberException();
                }
                sum += number;
            }
            return sum;
        }

        return 0;
    }
}
