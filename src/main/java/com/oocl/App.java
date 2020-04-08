package com.oocl;


import java.util.Scanner;

public class App
{
    public static final int MAX_CHANCE = 6;
    public static void main( String[] args )
    {
        System.out.println("Start Game! Please gues:\n");
        GuessNumberGame guessNumberGame = new GuessNumberGame();
        int chance=0;
        while(chance<MAX_CHANCE) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            String result = guessNumberGame.play(input);
            if(result.equals("4A0B")){
                System.out.println(result);
                break;
            }
            System.out.println(result);
            chance++;
        }
    }
}
