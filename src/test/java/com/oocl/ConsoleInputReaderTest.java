package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class ConsoleInputReaderTest {
    @Test
    public void should_return_input_when_get_input() {
        ConsoleInputReader reader = new ConsoleInputReader();
        String expected = "1234";
        InputStream inputStream =new ByteArrayInputStream(expected.getBytes());
        System.setIn(inputStream);
        String input =reader.getInput();
        Assert.assertEquals(expected, input);

    }
}