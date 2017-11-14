
package essayclass;

import java.util.Scanner;

/**
 * This class demonstrates the essay class, which extends the GradeActivity
 * class Essay Class (#4)
 *
 * @author olga.osinskaya
 */
public class GradeDemo {

    //get the grammar score
    public static void main(String[] args) {

        String input;//to hold input
        int gram;
        int pointsSpell;
        int len;
        int pointsCon;
        System.out.println("Please, enter student's score: ");
        System.out.print("Grammar (up to 30): ");
        Scanner keyboard = new Scanner(System.in);////opens a scanner, keyboard
        input = keyboard.nextLine();//prompt the user to input the score 
        gram = Integer.parseInt(input);

        System.out.print("Points Spelling (up to 20): ");
        input = keyboard.nextLine();//prompt the user to input the score 
        pointsSpell = Integer.parseInt(input);

        System.out.print("Length Score (up to 20): ");
        input = keyboard.nextLine();//prompt the user to input the score 
        len = Integer.parseInt(input);

        System.out.print("Points Content Score (up to 30): ");
        input = keyboard.nextLine();//prompt the user to input the score 
        pointsCon = Integer.parseInt(input);
        
        //Create a Essay object
        Essay escore=new Essay(gram,pointsSpell,len,pointsCon);
        //Display the results
        System.out.println("The exam grade is "+ escore.getGrade());
        System.exit(0);

    }
}
