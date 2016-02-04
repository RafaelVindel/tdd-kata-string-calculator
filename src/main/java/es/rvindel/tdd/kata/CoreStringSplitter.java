package es.rvindel.tdd.kata;

import java.util.Arrays;

public class CoreStringSplitter implements StringSplitter {

    @Override
    public int[] split(String numbers) {
        if(!numbers.isEmpty()) {
            if(numbers.startsWith("//")) {
                final char customSeparator = numbers.charAt(2);
                return Arrays.stream(numbers.substring(4).split(String.valueOf(customSeparator)))
                        .mapToInt(number -> Integer.parseInt(number))
                        .toArray();
            } else {
                return Arrays.stream(numbers.split(",|\n"))
                        .mapToInt(number -> Integer.parseInt(number))
                        .toArray();
            }
        }

        return new int[] {};
    }
}
