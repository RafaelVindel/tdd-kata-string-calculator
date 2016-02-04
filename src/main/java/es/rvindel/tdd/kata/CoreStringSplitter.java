package es.rvindel.tdd.kata;

import java.util.Arrays;

public class CoreStringSplitter implements StringSplitter {

    @Override
    public int[] split(String numbers) {
        if(!numbers.isEmpty()) {
            return Arrays.stream(numbers.split(",|\n"))
                    .mapToInt(number -> Integer.parseInt(number))
                    .toArray();
        }
        return new int[] {};
    }
}
