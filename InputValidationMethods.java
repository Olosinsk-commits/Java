package test_1;

/**
 * @author olga.osinskaya
 */
import java.util.Scanner;  // Needed for the Scanner class
import java.io.*;  // For file I/O classes

public class Test_1 {
 

    
    public static void main(String[] args) throws IOException {

        vlidateInt("Input Integer: ");
        validateDouble("\nInput float: ");
    }
    /**
     * The vlidateInt method prompt string as a parameter, ask user for input (using the prompt
     * sting provided), validate input, making sure the type of the numeric value provided by the
     * user is correct, and return the number to the calling code. The methods handle exceptions
     * as they arise, use exceptions to determine if the type of the number entered was correct.
     * @param prompt variable a, string str
     * @return variale a if it is the integers
     */
    
    public static int vlidateInt(String prompt) {
       
        //String str = null;   // To hold input string 
        int a = 0;       // To hold integer
        // To hold double
        // Create a Scanner object to read input
        String errorMessage = "Error: input must be an integer.";
        // Get the user's input.
        //boolean again = true;
        while (true) // input validation loop
        {
            Scanner keyboard;
            keyboard = new Scanner(System.in);
            System.out.print(prompt);
            //System.out.print(prompt);
            String str = keyboard.nextLine(); // get a string containing an int number
            str = str.trim(); // remove any extra whitespace from string sides
            try // trying to convert string to integer, expecting exceptions
            {
                a = Integer.parseInt(str);
                break;
                //continue;// convertion. 
            } catch (Exception e) // handle the exception below
            {
                System.out.print(errorMessage + "\n");
                // System.out.println(e.getMessage());
            }
        }
        System.out.println("The integer number you entered is: " + a);
        return a;
    }
    /**
     * The vlidateInt method prompt string as a parameter, ask user for input (using the prompt
     * sting provided), validate input, making sure the type of the numeric value provided by the
     * user is correct, and return the number to the calling code. The methods handle exceptions
     * as they arise, use exceptions to determine if the type of the number entered was correct.
     * @param prompt variable a, string str 
     * @return the variale a if it is the double 
     */
    
    public static int validateDouble(String prompt) {
        //String str;   // To hold input string 
        int a = 0;       // To hold integer
        double num = 0; // To hold double
        String errorMessage = "Error: input must be a float.";
        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);
        while (true) // input validation loop
        {
            System.out.print(prompt);
            String str = keyboard.nextLine(); // get a string containing a double number
            str = str.trim(); // remove any extra whitespace from sides
            try // trying to convert string to double, expecting exceptions
            {
                num = Double.parseDouble(str);
                break; // convertion. 
                // At this point exception may happen. 
                // Exception will throw execution into the "catch" block right away
                //If convertion went well, execution coninues to the next statements below
                // continue with the program
            } catch (Exception e) // handle the exception below
            {
                System.out.println("INPUT ERROR: Please enter a floating point number!!");
               
            }
        }
        System.out.println("The double number you entered is: " + num);
        return a;

    }
}


