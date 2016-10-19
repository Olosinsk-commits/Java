/**
* @author olga.osinskaya
*
* Program that simulates a game of craps.
*/

import java.util.Random;

public class GameSimulation {

    public static void main(String[] args) {
        // Display general name of program.
        System.out.println("========================");
        System.out.println("Game of Craps Simulation");
        System.out.println("========================");

        double totalWon = 0; // Accumulator for wins
        double totalLoss = 0;// Accumulator for losses
        // create a loop for 10000 games.	
        for (int x = 0; x < 10000; x++) {
            // Create a Random object to generate random numbers.		
            Random rand = new Random();

            int die1 = rand.nextInt(6) + 1; // To hold the random value of die #1
            int die2 = rand.nextInt(6) + 1; // To hold the random value of die #2

            int roll = die1 + die2;        // To hold sum die1 + die2 
            // Simulate rolling the dice.
            switch (roll) {
                // In case when sum of 1st roll 7 or 11
                case 7:
                case 11:
                    totalWon++;
                    break;
                // In case when sum of 1st roll 2,3,12
                case 2:
                case 3:
                case 12:
                    totalLoss++;
                    break;
                default:
                    // Sum is 4, 5, 6, 8, 9 or 10 on the first throw
                    die1 = rand.nextInt(6) + 1;
                    die2 = rand.nextInt(6) + 1;
                    int roll2 = die1 + die2;
                    while (roll2 != 7) {
                        if (roll == roll2) {
                            totalWon++;
                            break;
                        } else {

                            die1 = rand.nextInt(6) + 1;
                            die2 = rand.nextInt(6) + 1;

                            roll2 = die1 + die2;

                        }
                        die1 = rand.nextInt(6) + 1;
                        die2 = rand.nextInt(6) + 1;
                        roll2 = die1 + die2;

                    }
                    if (roll2 == 7) {
                        totalLoss++;
                    }
                    break;
            }
        }
        // Display the total number Wins, Losses and Probability.
        System.out.println("Wins:   " + totalWon);
        System.out.println("Losses: " + totalLoss);
        double odds = (totalWon / (totalWon + totalLoss) * 100);
        System.out.println("Probability of winning are: " + odds + "%");
    }
}

