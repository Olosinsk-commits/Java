/**
 * The coin class simulates a flipping of coin.
 */
package coin;

import java.util.Random;

/**
 * Assignment 1 #16 and #12
 * @author olga.osinskaya
 */
public class Coin {
//The sideUp field helds either “heads” or “tails” indicating
//the side of the coin that is facing up.
    private String sideUp;
    private int value;

    /**
     * A no-arg constructor that randomly determines the side of the coin that
     * is facing up (“heads” or “tails”) and initializes the sideUp field
     * accordingly.
     */
    public Coin() {
        Random rand = new Random();
        value = rand.nextInt(2);
        if (value == 1) {
            sideUp = "heads";
        } else {
            sideUp = "tails";
        }
    }

    /**
     * The toss simulates the tossing of the coin. When the toss method is
     * called, it randomly determines the side of the coin that is facing up
     * (“heads” or “tails”) and sets the sideUp field accordingly.
     */
    public void toss() {
        // Create a Random object.
        Random rand = new Random();

        // Get a random value 
        value = rand.nextInt(2);
        if (value == 1) {
            sideUp = "heads";
        } else {
            sideUp = "tails";
        }

    }

    /**
     * The getSideUp method
     * @return the value of the sideUp field
     */
    public String getSideUp() {
        return sideUp;
    }

}
