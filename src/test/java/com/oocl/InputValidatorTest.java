package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class InputValidatorTest {
    @Test
    public void should_input_only_four_digits() {
        InputValidator inputValidator = new InputValidator();
        String input = "1234";
        Boolean checkDigitNumber = inputValidator.checkDigitNumber(input);
        Assert.assertEquals(true,checkDigitNumber);
    }

    @Test
    public void should_input_distinct_digits(){
        InputValidator inputValidator = new InputValidator();
        String input = "1234";
        Boolean checkDuplicatedNumber = inputValidator.checkDuplicatedNUmber(input);
        Assert.assertEquals(true,checkDuplicatedNumber);



    }
}
