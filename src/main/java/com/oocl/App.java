package com.oocl;



import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class App
{
    public static final int MAX_CHANCE = 6;
    public static final int INPUT_LENGTH = 4;
    public static void main( String[] args )
    {
        System.out.println("Start Game! Please guess:\n");
        GuessNumberGame guessNumberGame = new GuessNumberGame();
        int chance=0;
        while(chance<MAX_CHANCE) {
            String input = "";
            while(true){
            Scanner scanner = new Scanner(System.in);
                 input = scanner.next();
            if(( !checkDuplicatedNUmber(input)) || !checkDigitNumber(input) ){
                System.out.println("Wrong Input,try again");
            }else{
                break;
            }
            }
            String result = guessNumberGame.play(input);
            if(result.equals("4A0B")){
                System.out.println(result);
                System.out.println("Win,All Correct");
                break;
            }
            System.out.println(result);
            chance++;
        }
        System.out.println("You have already tried 6 times, you lose!");
    }

    public static Boolean checkDigitNumber(String input) {
        return input.length()==INPUT_LENGTH;
    }

    public static Boolean checkDuplicatedNUmber(String input) {
        Set<Character> set = new HashSet<>();
        for(int index =0 ; index < input.length(); index++){
            if(!set.add(input.charAt(index))){
                System.out.println("false");
                return false;
            }
        }
        return true;
    }
}
