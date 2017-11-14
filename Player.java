/*
This game is meant for two or more players. In this game, 
the players take turns flipping a coin. Before the coin isflipped, 
players should guess if the coin will land face up or face down. 
If a player guesses correctly, then that player is awarded a point. 
If a player guesses incorrectly, then that player will lose a point. 
The firt player to score five points is the winner.
Write a program that simulates the game being played by two players. 
Use the Coin class that you wrote as an assignment in Chapter 6 
(Programming Challenge 16) to simulate the coin. 
Write a Player class to simulate the players.
 */
package headsortailsgame;

/**
 * Assignment 1 #12 Heads or Tails Game
 * @author olga.osinskaya
 */
public class Player {

   //private String Playerchoice;
    private String Playerchoice;
/**
 * 
 * @param choice 
 */
    public Player(String choice) {
        Playerchoice = choice;
    }
/**
 * 
 * @param choice 
 */
    public void setPlayerChoice(String choice) {
        this.Playerchoice = choice;
    }
/**
 * 
 * @param choice
 * @return 
 */
    public String getUserChoice(String choice) {
        return Playerchoice;
    }

}
