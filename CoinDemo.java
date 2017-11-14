/*This program demonstrates the Coin class. 
 */
package coin;

/**
 * Assignment 1 #16
 * @author olga.osinskaya
 */
public class CoinDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coin coin1 = new Coin();
        int counth = 0;//count for heads is facing up
        int countt = 0;//count for tails is facing up
        int loop = 20;//number of times the loop will iterate
        System.out.println("Coin Toss Simulator.");
        //create a loop to toss the coin 20 times.
        for (int i = 0; i < loop; i++) {
            // Roll the dice.
            coin1.toss();
            //Each time the coin is tossed, display the side that is facing up.
            System.out.println((i + 1) + " " + coin1.getSideUp());
            if (coin1.getSideUp() == "heads") //Count of the number of times heads is facing up and the number of times tails is facing up                 
            {
                counth++;
            } else {
                countt++;
            }

//Display values after the loop finishes.
        }
        System.out.println("The number of times heads is facing up: " + counth);
        System.out.println("The number of times tails is facing up: " + countt);

    }
}
