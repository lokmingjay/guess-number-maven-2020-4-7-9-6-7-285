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
    public void should_return_4A0B_when_answer_is_1234_given_input_is_1234() {
        result = guessNumberGame.play("1234");
        Assert.assertEquals("4A0B", result);
    }

    @Test
    public void should_return_2A2B_when_answer_is_1234_given_input_is_1243() {
        result = guessNumberGame.play("1243");
        Assert.assertEquals("2A2B", result);
    }

    @Test
    public void should_return_0A4B_when_answer_is_1234_given_input_is_4321() {
        result = guessNumberGame.play("4321");
        Assert.assertEquals("0A4B", result);
    }

    @Test
    public void should_return_1A1B_when_answer_is_1234_given_input_is_1563() {
        result = guessNumberGame.play("1563");
        Assert.assertEquals("1A1B", result);
    }

    @Test
    public void should_return_0A2B_when_answer_is_1234_given_input_is_2156() {
        result = guessNumberGame.play("2156");
        Assert.assertEquals("0A2B", result);
    }

    @Test
    public void should_return_0A0B_when_answer_is_1234_given_input_is_5678() {
        result = guessNumberGame.play("5678");
        Assert.assertEquals("0A0B", result);
    }
}
