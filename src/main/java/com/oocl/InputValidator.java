package com.oocl;

public class InputValidator {
    public static final int INPUT_LENGTH = 4;
    public Boolean checkDigitNumber(String input) {
        return  input.length() ==INPUT_LENGTH;
    }
}
