package com.oocl;

import java.util.HashSet;
import java.util.Set;

public class InputValidator {
    public static final int INPUT_LENGTH = 4;
    public Boolean checkDigitNumber(String input) {
        return  input.length() ==INPUT_LENGTH;
    }

    public Boolean checkDuplicatedNUmber(String input) {
        Set<Character> set = new HashSet<>();
        for (int index = 0; index < input.length(); index++) {
            if (!set.add(input.charAt(index))) {
                return false;
            }
        }
        return true;
    }
}
