package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    @Test
    public void Should_input_only_four_digits() {
        Boolean checkDigitNumber = App.checkDigitNumber("1122");
        Assert.assertEquals(true,checkDigitNumber);
    }

    @Test
    public void Should_input_distinct_digits(){
        Boolean checkDuplicatedNumber = App.checkDuplicatedNUmber("5231");
        Assert.assertEquals(true,checkDuplicatedNumber);

    }
}