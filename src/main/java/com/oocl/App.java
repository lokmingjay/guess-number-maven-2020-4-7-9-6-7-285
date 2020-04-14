package com.oocl;


public class App {
    public static final String LOSE_MESSAGE = "You have already tried 6 times, you lose!";
    private static final int MAX_CHANCE = 6;
    private static final String winResult = "4A0B";
    public static final String WIN_MESSAGE = "Win,All Correct";
    public static final String WRONG_INPUT_MESSAGE = "Wrong Input,try again\n";

    public static void main(String[] args) {
        GuessNumberGame guessNumberGame = new GuessNumberGame(new RandomGenerator());
        InputValidator inputValidator = new InputValidator();
        System.out.println(guessNumberGame.getRandomAnswer());
        int chance = 0;

        while (chance < MAX_CHANCE) {
            String input = new ConsoleInputReader().getInput();

            if ((!inputValidator.checkDuplicatedNUmber(input)) || !inputValidator.checkDigitNumber(input)) {
                System.out.println(WRONG_INPUT_MESSAGE);
                continue;
            }

            String result = guessNumberGame.play(input);

            if (result.equals(winResult)) {
                System.out.println(result);
                System.out.println(WIN_MESSAGE);
                return;
            }

            System.out.println(result);
            chance++;
        }
        System.out.println(LOSE_MESSAGE);
    }

}
