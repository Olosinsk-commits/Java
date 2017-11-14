/*
This program demonstrates the ArrayAnalys class 
 */
package arrayanalys;

import java.io.IOException;
import java.text.DecimalFormat;

/**
 * Assignment 1 #12
 * @author olga.osinskaya
 */
public class ADemo {
   

    public static void main(String[] args) throws IOException {
        String name;
        name="Numbers";
        //create the instance of the ArrayAnalys class for the array 
        ArrayAnalys array = new ArrayAnalys(name);
        //display result
        System.out.println("The total of the numbers in the array:   " + array.getTotal());
        System.out.println("The smallest integer in the set:   " + array.getLowest());
        System.out.println("The highest integer in the set:   " + array.getHighest());       
        String formattedDouble = new DecimalFormat("#0.00").format(array.getAverage());
        System.out.println("The average of the numbers in the array:   " + formattedDouble);
    }

}
