package com.oocl;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class GuessNumberGameTest {
    @Test
    public void should_get_distinct_random_number() {
        GuessNumberGame guessNumberGame = new GuessNumberGame();
        String randomAnswer = guessNumberGame.getRandomAnswer();
        Boolean result = checkDuplicatedChar(randomAnswer);
        assertEquals(true, result);
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
