package com.oocl;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class GuessNumberGame {
    private String randomAnswer;
    public static final String ANSWER_RESULT_PATTERN = "%sA%sB";

    public String getRandomAnswer() {
        return randomAnswer;
    }

    public void setRandomAnswer(String randomAnswer) {
        this.randomAnswer = randomAnswer;
    }

    public GuessNumberGame(RandomGeneratorIF randomGenerator) {
        randomAnswer = randomGenerator.generate();
    }

    public String play(String inputNumber) {
        int positionAndValueCorrectCount = 0;
        int onlyNumberCorrectCount = 0;

        for (char number : inputNumber.toCharArray()) {
            boolean isPositionAndNumberCorrect = this.randomAnswer.contains(Character.toString(number)) &&
                    this.randomAnswer.indexOf(number) == inputNumber.indexOf(number);
            boolean onlyNumberCorrect = this.randomAnswer.contains(Character.toString(number)) &&
                    this.randomAnswer.indexOf(number) != inputNumber.indexOf(number);
            if (isPositionAndNumberCorrect) {
                positionAndValueCorrectCount++;
            }
            if (onlyNumberCorrect) {
                onlyNumberCorrectCount++;
            }
        }
        return String.format(ANSWER_RESULT_PATTERN, positionAndValueCorrectCount, onlyNumberCorrectCount);
    }
}
