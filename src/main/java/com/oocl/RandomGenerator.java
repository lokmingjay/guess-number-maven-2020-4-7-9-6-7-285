package com.oocl;

import java.util.Arrays;
import java.util.Collections;

public class RandomGenerator implements RandomGeneratorIF {
    private static final int RANDOM_DIGIT = 4;

    @Override
    public String generate() {
        Integer[] randomArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String randomNumberString = "";
        Collections.shuffle(Arrays.asList(randomArray));
        for (int index = 0; index < RANDOM_DIGIT; index++) {
            randomNumberString += randomArray[index];
        }
        return randomNumberString;
    }
}
