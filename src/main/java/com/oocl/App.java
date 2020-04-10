package com.oocl;


import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class App {
    public static final int MAX_CHANCE = 6;
    public static final String winReuslt = "4A0B";

    public static void main(String[] args) {
        System.out.println("Start Game! Please guess:\n");
        GuessNumberGame guessNumberGame = new GuessNumberGame(new RandomGenerator());
        InputValidator inputValidator = new InputValidator();
        System.out.println(guessNumberGame.getRandomAnswer());
        int chance = 0;

        while (chance < MAX_CHANCE) {
            String input = new ConsoleInputReader().getInput();

            if ((!checkDuplicatedNUmber(input)) || !inputValidator.checkDigitNumber(input)) {
                System.out.println("Wrong Input,try again\n");
                continue;
            }

            String result = guessNumberGame.play(input);

            if (result.equals(winReuslt)) {
                System.out.println(result);
                System.out.println("Win,All Correct");
                return;
            }

            System.out.println(result);
            chance++;
        }
        System.out.println("You have already tried 6 times, you lose!");
    }


    public static Boolean checkDuplicatedNUmber(String input) {
        Set<Character> set = new HashSet<>();
        for (int index = 0; index < input.length(); index++) {
            if (!set.add(input.charAt(index))) {
                return false;
            }
        }
        return true;
    }
}
