package com.oocl;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class GuessNumberGame {
    private static final int RANDOM_DIGIT = 4;

    private String randomAnswer;


    public String getRandomAnswer() {
        return randomAnswer;
    }

    public void setRandomAnswer(String randomAnswer) {
        this.randomAnswer = randomAnswer;
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

   // public String play(String input) {
        // first get the common element from the input where value is same as random value
        // e.g. 2 only, for this two ,we can compare the position between string is same

       // return "";
   // }

    public List<Character> getCommonElement(String input) {
       List<Character> inputCharList = input.chars().mapToObj(element -> (char)element).collect(Collectors.toList());
       List<Character> randomAnsCharList = randomAnswer.chars().mapToObj(element -> (char)element).collect(Collectors.toList());
       inputCharList.retainAll(randomAnsCharList);
        return inputCharList;

    }
}
