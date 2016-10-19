/**
* @author olga.osinskaya
* Write a program with a loop that lets the user enter a series of positive integers. The user
* should enter -99 to signal the end of the series. After all the numbers have been entered,
* the program should display the largest and the smallest numbers entered.
*/

package greatestandleast;

import java.util.Scanner;

public class GreatestAndLeast {

    public static void main(String[] args) {
        int num = 0, max = 0, min = 0; // To hold integer
        int count = 0; // To hold integer
        String str; // To hold input string 

        System.out.print("==============================================================");
        System.out.print("\nPlease enter a positive integers to compare. Enter -99 to quit.");
        System.out.print("\n==============================================================");
        System.out.print("\nNumbers: ");

// Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);
// Get the user's input.
        while (true) // input validation loop  
        {
            System.out.print("Enter an integer number please: ");
            str = keyboard.nextLine(); // get a string containing an int number
            str = str.trim(); // remove any extra whitespace from string sides        
            try // trying to convert string to integer, expecting exceptions
            {
                num = Integer.parseInt(str);  // convertion.           
// At this point exception may happen.           
// Exception will throw execution into the "catch" block right away           
// If convertion went well, execution coninues to the next statement below           
                //again = false;
// stop input validation loop           
// continue with the program         
            } catch (Exception e) // handle the exception below         
            {
                System.out.println("INPUT ERROR: Please enter an integer number!!");
                System.out.println(e.getMessage());
                continue;
            }

            if (num == -99) {
                if (count == 0) {
                    System.out.println("\nNo numbers were entered");
                } else {
// Display the results.
                    System.out.println("\nThe largest number: " + max + "\nThe smallest number: " + min);
                }
// exit 
                System.exit(0);
            }
// Compare numbers
            if (count == 0) {
                max = num;
                min = num;
            } else if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
            count++;
        } // end of validation loop
    }
}

