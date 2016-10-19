/**  *  * @author Olga Osinskaya  */ 

package vars_consts_calculations;
import java.util.Scanner; 
import javax.swing.JOptionPane;
public class Vars_Consts_Calculations {

        public static void main(String[] args) 
        {         
//******** Logic Problem code area **********       
double firstNumber; // to hold the first number     
double secondNumber;
double buffer;// to hold the second number     
// create scanner object to read input     
Scanner keyboard = new Scanner(System.in);  
System.out.print("Logic Problem code area\n");
// Prompt user to enter the first number.
System.out.print("Enter the first number:");     
// input the first number     
firstNumber = keyboard.nextDouble();         
// Promt user to enter the second number.     
System.out.print("Enter the second number:");     
// input the second number     
secondNumber = keyboard.nextDouble();   
// Echo print the input.     
System.out.println("You input the numbers as "+ firstNumber+" and " +
        secondNumber );        
 // Now we will swap the values.    
buffer = firstNumber;
firstNumber = secondNumber ; 
secondNumber = buffer;     

// Output the values.     
System.out.println("After swapping, the values of the two numbers are " +
        firstNumber+" and " + secondNumber );
//System.out.print("End of Logic Problem code area:\n");
// ********* End of Logic Problem code area  **********   
 
// ********* Circle Area Problem code area ***********    
// Implement the following step-by-step plan   
System.out.print("Circle Area Problem code area \n");
Double PI = 3.14;                    // 1. Declare double constant PI to hold 3.14 
Double radius;                       // 2. Declare a double variable to store radius 
Double area;                         // 3. Declare a double variable to store area 
Scanner sc = new Scanner(System.in); // 4. Prompt the user to enter radius.  
System.out.print("Enter the radius:"); // 5. Input radius and store it in variable     
radius = sc.nextDouble(); 
// 6. Calculate circle area. Find the formula on the web if you don't remember it   
area = PI * (radius * radius); 
// 7. Output the circle's radius and area values in user-friendly fashion 
System.out.println("The circle's radius " + radius + "\nThe area of circle is: " + area);
JOptionPane.showMessageDialog(null, "The circle's radius: " + 
                    radius + "\n The area of circle is: " + area);
System.exit(0);
   }
}
// ********* End of Circle Area Problem code area ***********       }     }
   
    
     
   

  
        

