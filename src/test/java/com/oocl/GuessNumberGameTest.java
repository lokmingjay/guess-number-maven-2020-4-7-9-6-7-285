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
    public void shoud_determine_no_of_correct_value_and_position(){
        String result = "";
        GuessNumberGame guessNumberGame = new GuessNumberGame();
        guessNumberGame.setRandomAnswer("1234");
        result = guessNumberGame.play("1567");
        Assert.assertEquals("1A0B",result);
        result = guessNumberGame.play("2478");
        Assert.assertEquals("0A2B",result);
        result = guessNumberGame.play("0324");
        Assert.assertEquals("1A2B",result);
        result = guessNumberGame.play("5678");
        Assert.assertEquals("0A0B",result);
        result = guessNumberGame.play("4321");
        Assert.assertEquals("0A4B",result);
        result = guessNumberGame.play("1234");
        Assert.assertEquals("4A0B",result);
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
