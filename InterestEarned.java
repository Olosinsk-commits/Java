/*
 @author olga.osinskaya
 Assuming there are no deposits other than the original investment, 
 the balance in a savings account after one year might be calculated as:

 Amount = Principal * (1 + Rate/T)ET

 Principal is the balance in the savings account,
 Rate is the interest rate (in decimal form –0.0425 for 4.25%), 
 and T is the number of times the interest is compounded during 
 a year (T is 4 if the interest is compounded quarterly). 
 Write a program that asks for the principal, 
 the interest rate, and the number of times the interest is compounded.
 */
package interestearned;
import javax.swing.JOptionPane;
// import Decimal Format class 
import java.text.DecimalFormat;
public class InterestEarned 
{

 	public static void main(String [] args)
 	{       
                String inputString; // For reading input
                ////Declare a variety of double variables: Amount, Principal, Rate, Interest, Number_of_times
              	double Amount, Principal, Rate, Interest;
                //Rate = 0.0425;
                double Number_of_times ;
 		
                // Get the Principal
                inputString = JOptionPane.showInputDialog("Principal:");
                 // Convert the input to a double
                Principal = Double.parseDouble(inputString);
                // Get the Interest Rate
                inputString = JOptionPane.showInputDialog("Interest Rate:"+"%");
                Rate = Double.parseDouble(inputString);
                 // Get the Times compounded
                inputString = JOptionPane.showInputDialog("Times compounded:");
                Number_of_times = Double.parseDouble(inputString);
                
                // Calculate the Amount
                Amount = Principal*Math.pow((1.0 + (Rate/100)/Number_of_times),Number_of_times); 
                // Calculate the Interest
 		Interest = Amount - Principal ;
                
                DecimalFormat formatter = new DecimalFormat("0.00");
                
                //String padleft = String.format("%s%, "RR", 66);
                //System.out.print(padleft);
 		// Display the results
                //JOptionPane.showMessageDialog(null, 
                System.out.print(  
                    " Interest rate:        " + formatter.format(Rate) +"%" 
                + "\n Times compounded:     " + formatter.format(Number_of_times) 
                + "\n Principal:            " + "$"+formatter.format(Principal) + "\t"
                + "\n Interest:             " + "$"+formatter.format(Interest)+"\t"
                + "\n Amount in Savings:    " + "$"+formatter.format(Amount)+"\t");
                // End the program
                System.exit(0);
 			
 	}
 }
