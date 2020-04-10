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
    public void shoud_determine_no_of_correct_value_and_position(){
        String result = "";
        RandomGenerator randomGenerator= new RandomGenerator();
        GuessNumberGame guessNumberGame = new GuessNumberGame(randomGenerator);
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

}
