package vendingmachine.java;
/**
  @author olga.osinskaya
  
  Vending Machine   
  Write a program that determines the change to be dispensed from a vending 
  machine. An item in the machine can cost between 25 cents and 1 dollar, 
  in 5-cent increments (25, 30, 35,…, 90, 95, 100), and the machine accepts
  only a single dollar bill to pay for the item. For example, 
  a possible sample dialog might be the following:
  Enter price of item (from 25 cents to a dollar, in 5-cent increments):
      45
      You bought an item for 45 cents and gave me a dollar,
      So your change is 
      2 quarters 
      0 dimes, and
      1 nickels.
 */

//quarters = 25c
//dimes    =10c
//nickels  =5 

// Needed for the Scanner class
import java.util.Scanner;  

public class VendingMachineJava 
{
 
    public static void main(String[] args) 
    {
      int price;  // To hold a price
      int quarters= 25; // To hold a quarters
      int dimes=10; // To hold a dimes
      int nickels=5; // To hold a nickels
      int total = 100; // To hold a total
      // To hold a count of guarters, count of dimes, count of nickels
      int count_quarters, count_dimes, count_nickels; 
      
    // Create a Scanner object to read input
    Scanner keyboard = new Scanner(System.in);
        
    // Get the price   
    System.out.print("Enter price of item (from 25 cents to a dollar, in 5-cent increments):  " );
    price = keyboard.nextInt();
    
    //calculatng 
    count_quarters = (total - price)/quarters;
    count_dimes = ((total-price) -(count_quarters*quarters))/dimes;
    count_nickels= ((total-price) -(count_quarters*quarters)-(count_dimes*dimes))/nickels;
      
    // Display the information back to the user
    System.out.println("\nYou bought an item for " + price + " cents and gave me a dollar, \n" +
                         "So your change is \n"    +
                            count_quarters+ " quarters \n"   +
                            count_dimes   + " dimes, and \n" +
                            count_nickels + " nickels. ");
    // End the program
     System.exit(0); 
    }
    
}

