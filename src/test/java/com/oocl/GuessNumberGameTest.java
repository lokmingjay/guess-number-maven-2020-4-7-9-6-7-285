package com.oocl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GuessNumberGameTest {

    private RandomGenerator randomGenerator;
    private GuessNumberGame guessNumberGame;
    String result;
    String answer;
    @Before
    public void setUp() throws Exception {
         answer = "1234";
        result = "";
        randomGenerator = Mockito.mock(RandomGenerator.class);
        Mockito.when(randomGenerator.generate()).thenReturn(answer);
        guessNumberGame = new GuessNumberGame(randomGenerator);
    }

    @Test
    public void shoud_determine_no_of_correct_value_and_position(){
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
