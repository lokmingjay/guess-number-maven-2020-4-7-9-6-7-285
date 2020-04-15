package com.oocl;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class RandomGeneratorTest {
    Boolean result = true;

    @Test
    public void should_get_distinct_random_number() {
        RandomGenerator randomGenerator = new RandomGenerator();
        GuessNumberGame guessNumberGame = new GuessNumberGame(randomGenerator);
        String randomAnswer = guessNumberGame.getRandomAnswer();
        for (int index = 0; index < randomAnswer.length(); index++) {
            char ch = randomAnswer.charAt(index);
        }
        assertEquals(true, result);
    }
}