package restaurantbill;

/*@author olga.osinskaya 
*  Restaurant Bill
* Write a program that computes tax and tip on a restaurant bill. Ask user to input the bill
* amount and the tip percentage he/she wants to give to the waiter. The tax should be 10%
* of the meal cost, and must be set as a constant in your code. The tip should be calculated
*  after adding tax. Display the meal cost, tax amount, tip amount, and total bill on the  screen.
* Name your solution file RestaurantBill.java.
*/
 import javax.swing.JOptionPane;
 	
 public class RestaurantBill
 {
 	public static void main(String [] args)
 	{       
                String inputString; // For reading input

                

              	double mealcost,tip, totalWithTax, tipAmount, billTotal, tax ; 
                //Declare a variety of double variables: meal cost, total bill with tip, amount of tip, total bill amount (without tax)
 		tax = 0.1; //To hold tax (10%).

 		                
                // Get the charge for meal
                inputString = JOptionPane.showInputDialog("What is the charge for your meal:");
                mealcost = Integer.parseInt(inputString);
                
                // Get the tip from the user 
                inputString = JOptionPane.showInputDialog("What is the tip percentage" + 
                        " you want to give to the waiter:");
                tip = Double.parseDouble(inputString);
 				
 		//Calculate the tax of the meal cost
 		tax = tax * mealcost;  
                //Calculate the mealcost with the tax
 		totalWithTax = mealcost + tax;
                // Calculate the tip
 		tipAmount = totalWithTax*tip/100;
                // Calculate the total
 		billTotal = totalWithTax + tipAmount;
 		
 		// Display the results
                JOptionPane.showMessageDialog(null, " Cost of the meal: $" + 
                    mealcost + "\n Tax: $" +
                    tax + "\n Tip: %" + tip + "\n Total Bill(tip included): $" 
                        + billTotal);
                // End the program
                System.exit(0);
 			
 	}
 }
