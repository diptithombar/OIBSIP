package com.company;
import java.util.Scanner;
import java.util.Random;
class Game{
    int randInt,userInt,noOfGuesses=0;

    public Game(){
        Random rand = new Random();
        randInt = rand.nextInt(101);
    }
    public void takeUserInput(){
        Scanner gameInput = new Scanner (System.in);
        System.out.print("Guess any number (0 to 100) = ");
        userInt = gameInput.nextInt();
    }
    public void isCorrectNumber(){
        if (userInt>randInt){
            System.out.println("\tTOO HIGH !");
        }
        else if (userInt<randInt){
            System.out.println("\tTOO LOW !");
        }
        else if (userInt==randInt)
            System.out.println("\n\tCORRECT NUMBER !");
    }
    public void setnoOfGuesses(int guess){
        noOfGuesses = guess;
    }
    public int getnoOfGuesses(){
        return noOfGuesses;
    }
}


public class Guass_The_Number {
    public static void main(String[] args) {
        Game game = new Game();
        do {
            game.takeUserInput();
            if (game.userInt<0||game.userInt>100){
                System.out.println("\tNUMBER OUT OF RANGE !\n\tTry Again.\n");
                continue;
            }
            game.setnoOfGuesses(++game.noOfGuesses);
            game.isCorrectNumber();
        }while(game.userInt!=game.randInt);
        System.out.println("\tNumber of guesses - "+game.getnoOfGuesses());
    }


}
