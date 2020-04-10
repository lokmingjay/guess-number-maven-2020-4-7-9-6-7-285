package com.oocl;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class GuessNumberGame {


    private String randomAnswer;


    public String getRandomAnswer() {
        return randomAnswer;
    }

    public void setRandomAnswer(String randomAnswer) {
        this.randomAnswer = randomAnswer;
    }

    public GuessNumberGame(RandomGeneratorIF randomGenerator) {
        randomAnswer = randomNumberGenerator(randomGenerator);
    }

    private String randomNumberGenerator(RandomGeneratorIF randomGenerator) {
        return randomGenerator.generate();
    }

    // public String play(String input) {
    // first get the common element from the input where value is same as random value
    // e.g. 2 only, for this two ,we can compare the position between string is same

    // return "";
    // }


    public String play(String input) {
        int correctValueOnly = 0;
        int correctValueAndPosition = 0;
        List<Character> inputCharList = input.chars().mapToObj(element -> (char) element).collect(Collectors.toList());
        List<Character> commonCharList = input.chars().mapToObj(element -> (char) element).collect(Collectors.toList());
        List<Character> randomAnsCharList = randomAnswer.chars().mapToObj(element -> (char) element).collect(Collectors.toList());
        commonCharList.retainAll(randomAnsCharList);

        for (Character ch : commonCharList) {
            if (inputCharList.indexOf(ch) == randomAnsCharList.indexOf(ch)) {
                correctValueAndPosition++;
            } else {
                correctValueOnly++;
            }
        }
        return correctValueAndPosition + "A" + correctValueOnly + "B";
    }


}
