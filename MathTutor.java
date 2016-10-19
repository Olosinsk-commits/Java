package mathtutor;

import java.util.Scanner;

/**
 *
 * @author olga.osinskay Write a program that can be used as a math tutor for a
 * young student. The program displays a menu allowing the user to select an
 * addition or subtraction problem.
 */
public class MathTutor {

    public static void main(String[] args) {

        String str;   // To hold input string
        int num1;   // number 1  
        int num2;   // number 2
        int choice = 0; // for menu choice
        int total = 0;

        //controls the repetition of the whole choice and calculation process 
        while (true) // menu repitition loop
        {
            num1 = (int) (Math.random() * 999 + 1);
            num2 = (int) (Math.random() * 999 + 1);
            System.out.print("\nPlease choose one of the options below\n Enter 1 for addition \n Enter 2 for subtraction \n Enter 3 to quit the program\n :> ");
            // Create a Scanner object to read input.
            Scanner keyboard = new Scanner(System.in);
            while (true) // input validation loop
            {
                str = keyboard.nextLine(); // get a string containing an int number
                str = str.trim(); // remove any extra whitespace from string sides
                try // trying to convert string to integer, expecting exceptions
                {
                    choice = Integer.parseInt(str);  // convertion. 
                    // At this point exception may happen. 
                } catch (Exception e) // handle the exception below
                {
                    System.out.println("INPUT ERROR: Please enter an integer number!!\n");
                    continue;
                }

                if (choice > 3 || choice < 1) // invalid choice
                {
                    System.out.print("INPUT ERROR: " + str + " is INVALID choice, please try again\n:>");
                    continue; // repeat input process
                }
                break;
            }

            switch (choice) {
                case 1: {
                    // Display the total sum of numbers
                    System.out.println("You chose addition!");
                    System.out.println(" " + num1);
                    System.out.println("+" + num2);
                    System.out.println("----");
                    total = num1 + num2;
                }
                break;
                case 2: {
                    // Display the total subtraction of numbers
                    System.out.println("You chose subtraction!");
                    System.out.println(" " + num1);
                    System.out.println("-" + num2);
                    System.out.println("----");
                    total = num1 - num2;
                }
                //exit program 
                break;
                case 3:
                    System.out.print("\nQuitting!! By-By!\n---------------\n");
                    System.exit(0);

            }

            int answer = 0;
            while (true) // input validation loop
            {
                str = keyboard.nextLine();
                str = str.trim(); // remove any extra whitespace from string sides
                try // trying to convert string to integer, expecting exceptions
                {
                    answer = Integer.parseInt(str);  // convertion. 
                    // At this point exception may happen. 
                    break;
                    // continue with the program
                } catch (Exception e) // handle the exception below
                {
                    System.out.println("INPUT ERROR: Please enter an integer number!!\n");
                }
            }

            if (answer != total) {
                System.out.print("\nWrong answer, the correct answer is " + total + "\n");
            } else {
                System.out.print("\nCorrect!");
                //answerCorrectly++;
            }

        }
    }

}

