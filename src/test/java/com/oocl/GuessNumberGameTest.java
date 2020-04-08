package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GuessNumberGameTest {
    @Test
    public void should_get_distinct_random_number() {
        GuessNumberGame guessNumberGame = new GuessNumberGame();
        String randomAnswer = guessNumberGame.getRandomAnswer();
        Boolean result = checkDuplicatedChar(randomAnswer);
        assertEquals(true, result);
    }
    @Test
    public void should_get_same_number_between_input_and_random_number(){
        GuessNumberGame guessNumberGame = new GuessNumberGame();
        guessNumberGame.setRandomAnswer("5234");
        List<Character> result = guessNumberGame.getCommonElement("1543");
        List<Character> expect = Arrays.asList('5','4','3');
        Assert.assertEquals(expect,result);
    }
    private Boolean checkDuplicatedChar(String randomAnswer) {
        HashSet<Character> characterSet = new HashSet<Character>();
        for (int index = 0; index < randomAnswer.length(); index++) {
            char ch = randomAnswer.charAt(index);
            if (characterSet.contains(ch)) {
                return false;
            } else {
                characterSet.add(ch);
            }
        }
        return true;
    }
}
