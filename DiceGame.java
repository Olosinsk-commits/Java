/*
This program creates two instances of the Die
class (each a 6-sided die). One Die object is the computer’s die, and the other Die object is the
user’s die.
The program has a loop that iterates 10 times. Each time the loop iterates, it rolls
both dice. The die with the highest value wins. In case of a tie, there is no winner for that
particular roll of the dice.
As the loop iterates, the program keeps count of the number of times the computer wins,
and the number of times that the user winds. After the loop performs all of its iterations, the
program displays who was the grand winner, the computer or the user.
 */
package dicegame;

/**
 * Assignment 1 #14 
 * @author olga.osinskaya
 */
public class DiceGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        final int DIE_SIDES = 6;  // Number of sides for dies
        final int MAX_ROLLS = 10;   // Number of times to roll
        int userw = 0;//count for user's wins
        int compw = 0;//count for computer's wins
        Die die1 = new Die(DIE_SIDES); //create the instance of the Die class for the computer
        Die die2 = new Die(DIE_SIDES);//create the instance of the Die class for the user

        // Roll the dice 10 times.
        System.out.println("Rolling the dice " + MAX_ROLLS + " times.");
        //create the loop
        for (int i = 0; i < MAX_ROLLS; i++) {
            // Roll the dice.
            die1.roll();
            die2.roll();

            System.out.println((i+1)+" Computer:" + die1.getValue() + " " + "User:" + die2.getValue());

            // Display the values of the dice.
            if (die1.getValue() > die2.getValue()) {
                System.out.println("Computer Won!");
                // count of the number of times the computer wins
                compw++;

            } else if (die1.getValue() < die2.getValue()) {
                System.out.println("User Won!");
                //count of the number of times the user wins
                userw++;
            } else {
                System.out.println("There is no winner for that particular roll of the dice!");
            }
            
        }
        // display who is the grand winner
        if (userw > compw) {
            System.out.println("The grand winner is: User");
        } else if (userw < compw) {
            System.out.println("The grand winner is: Computer");
        } else {
            System.out.println("There is no winner");
        }
    }
}
