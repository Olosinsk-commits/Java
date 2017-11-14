/*
The simulator of the "Heads or Tails" game for two players.
Before the coin isflipped, players should guess if the coin will land face up or face down. 
If a player guesses correctly, then that player is awarded a point. 
If a player guesses incorrectly, then that player will lose a point. 
The firt player to score five points is the winner.
 */
package headsortailsgame;

import java.util.Scanner;

/**
 * Assignment 1 #12 Heads or Tails Game
 * @author olga.osinskaya
 */
public class PlayerDemo {

    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;
        System.out.println("Players, please, enter heads or tails.");
        while (count1 < 5 && count2 < 5) {
            System.out.print("Player 1: ");
            Scanner keyboard = new Scanner(System.in);////opens a scanner, keyboard
            String input1 = keyboard.nextLine();////prompt the user 1
            System.out.print("Player 2: ");
            String input2 = keyboard.nextLine();////prompt the user 2

            Player player1 = new Player(input1);//create the instance of the Player class for the Player1 
            Player player2 = new Player(input2);//create the instance of the Player class for the Player2 
            Coin coin1 = new Coin();//create the instance of the Coin class for the Coin1 
            //compare player1 choice and computer random
            if (player1.getUserChoice(input1).equals(coin1.getSideUp())) {
                count1++;//increase
            } else {
                count1--;//decrease
            }
             //compare player2 choice and computer random
            if (player2.getUserChoice(input2).equals(coin1.getSideUp())) {
                count2++;//increase
            } else {
                count2--;//decrease
            }
            //display count and computer random
            System.out.println("Computer: " + coin1.getSideUp());
            System.out.println("Count: " + count1 + " : " + count2);
        }
        //display the winner 
        if (count1 == 5) {
            System.out.println("Player#1 won");
        } else if (count1 == 5 && count2 == 5) {
            System.out.println("Tie");
        } else {
            System.out.println("Player#2 won");
        }
    }

}
