package com.oocl;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class GuessNumberGame {
    private static final int RANDOM_DIGIT = 4;
    private String randomAnswer;


    public String getRandomAnswer() {
        return randomAnswer;
    }

    public GuessNumberGame() {
        randomAnswer = randomNumberGenerator();
    }

    private String randomNumberGenerator() {
        Integer[] randomArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String randomNumberString = "";
        Collections.shuffle(Arrays.asList(randomArray));
        for (int index = 0; index < RANDOM_DIGIT; index++) {
            randomNumberString += randomArray[index];
        }
        return randomNumberString;
    }

}
