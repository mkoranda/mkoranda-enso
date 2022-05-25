package no.enso;

import java.util.stream.IntStream;

public class Calculator {

    public static int totalAllMultiples(int upperBound) {
        return IntStream
                .range(1, upperBound)
                .filter(Calculator::isMultipleOfThreeOrFive)
                .sum();
    }

    static boolean isMultipleOfThreeOrFive(int value) {
        return value > 0 && (value % 3 == 0 ||  value % 5 == 0);
    }
}
