package test_1;

/**
 * @author olga.osinskaya
 */
import java.util.Scanner;

//A recursive method int recursiveSum(int num)that accepts a positive 
//integer argument and returns the sum of all the integers from 1 
//up to the number passed as an argument. For example, if 50 was passed 
//as an argument, the method will return the sum: 1+2+3+…+50. Test the method in main(). 
//Ask the user for an integer and pass it to your function to handle. 
//Output the resulting sum.
public class Test_1 {

    public static void main(String[] args) {
        int num = 0; //to hold number 
        String str; //to hold str

        while (true) // menu repitition loop
        {

            System.out.print("Enter a positive integer argument:\n");
            Scanner keyboard = new Scanner(System.in);
            // call the recursuion function 

            while (true) // input validation loop
            {
                str = keyboard.nextLine(); // get a string containing an int number
                str = str.trim(); // remove any extra whitespace from string sides
                try // trying to convert string to integer, expecting exceptions
                {
                    num = Integer.parseInt(str); // convertion. 
                    // At this point exception may happen. 
                } catch (Exception e) // handle the exception below
                {
                    System.out.println("INPUT ERROR: Please enter an integer number!!\n");
                    continue;
                }

                if (num < 1) // invalid choice
                {
                    System.out.print("INPUT ERROR: " + str + " is INVALID choice, please try again\n:");
                    continue; // repeat input process
                }
                System.out.println("The sum from 1 to " + num + " is:\n" + recursion(num));
                break;
            }
            break;
        }
    }

    /**
     * The recursion method accepts a positive integer argument and returns the
     * sum of all the integers from 1 up to the number passed as an argument.
     * @param num -argument. Range "To"
     * @return the sum of all the integers from 1 to number "To"  
     */
    public static int recursion(int num) {

        // conditions for exit 
        // when stop and repeat recursion 
        if (num == 1) { // base case
            return 1;
        }
        return recursion(num - 1) + num; // recursive step
    }
}

