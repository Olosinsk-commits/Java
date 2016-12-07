package largeints;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author olga.osinskaya
 */
public class LargeInts {

    final static int SIZE = 20;//The size of the “large integer” is a global constant

    public static void main(String[] args) throws IOException {
        System.out.print("Enter your 1st number: ");
        int[] digits1 = InputLargeInt(); //input an integer 1
        System.out.print("Enter your 2nd number: ");
        int[] digits2 = InputLargeInt(); //input an integer 2
        System.out.println("Your 1st number is: " + Arrays.toString(digits1));
        System.out.println("Your 2nd number is: " + Arrays.toString(digits2));
        try {
            add(digits1, digits2);// call method add to add integers together. 
            System.out.println("Sum is:             " + Arrays.toString(digits1));//print sum of 2 integers
        } catch (Exception e) // handle the exception below
        {
            System.out.print(e.getMessage());
            // throws the Exception
        }

    }

    /**
     * The InputLargeInt method reads a large integer from the user as a string,
     * stores it in array of size 20 in “reversed” order.
     * @return the array of digits (integers)
     */
    public static int[] InputLargeInt() {

        Scanner keyboard;
        keyboard = new Scanner(System.in);
        String str;

        while (true) {
            str = keyboard.nextLine();
            str = str.trim();

            if (str.length() > 20) {
                System.out.println("Length more 20! Enter again: ");
                continue;
            }

            boolean allNums = true;
            for (int i = 0; i < str.length(); i++) {
                char sim = str.charAt(i);
                boolean isDigit = Character.isDigit(str.charAt(i));

                if (!isDigit) {
                    System.out.println("Please enter integer: ");
                    allNums = false;
                    break;
                }
            }
            if (allNums == false) {
                continue;
            } else {
                break;
            }
        }
        int[] list = new int[SIZE];
        for (int i = str.length() - 1; i >= 0; i--) {

            char sim = str.charAt(i);
            int num = Character.getNumericValue(sim);
            list[str.length() - i - 1] = num;
        }
        return (list);
    }

    /**
     * The add method adds two “large numbers” by implementing the usual “paper 
     * and pencil” addition algorithm and stores the result of addition in the
     * first array (called a in my method header). 
     * @param a
     * @param b
     * @throws RuntimeException type exception with the message “Integer overflow”,
     * If the resulting “number” is more than 20 digits long, 
     */
    public static void add(int[] a, int[] b) throws RuntimeException {
        int total = 0;
        int remainder = 0;
        for (int i = 0; i < a.length; i++) {
            total = a[i] + b[i] + remainder;
            if (total >= 10) {
                a[i] = total - 10;
                remainder = 1;
                //a[0]=remainder;
            } else {
                a[i] = total;
                remainder = 0;
            }
        }
        if (remainder == 1) { //если при сложение чисел в конце массива остаток=1
            throw new RuntimeException("Integer overflow");
        }

    }

}

