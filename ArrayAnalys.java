/*
ArrayAnalys class accepts a file name as its argument, read the contents of the 
file into an array, and then displays the following data:
*the lowest number in the array
*the highest number in the array
*the total of the numbers in the array
*the average of the numbers in the array
 */
package arrayanalys;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Assignment 1 #12
 * @author olga.osinskaya
 */
public class ArrayAnalys {


    String FileN; //name of file
    double Total = 0;//total
    int highest = 0;//highest
    int lowest = 0;//lowest
    double average = 0;//average
/**
 * Constructor 
 * @param The FileName the name of the file 
 * @throws FileNotFoundException 
 */
    public ArrayAnalys(String FileName) throws FileNotFoundException {
        FileN = FileName;
    }

/**
 * The getTotal method 
 * @return the Total of numbers in the file
 * @throws FileNotFoundException 
 */
    public double getTotal() throws FileNotFoundException {
        File file = new File(FileN);
        Scanner inputFile = new Scanner(file);
        while (inputFile.hasNextInt()) {
            Total += inputFile.nextInt();
        }
        return Total;
    }
/**
 * The getLowest method
 * @return lowest element in the file
 * @throws FileNotFoundException 
 */
    public int getLowest() throws FileNotFoundException {
        File file = new File(FileN);
        Scanner inputFile = new Scanner(file);
        lowest = inputFile.nextInt();
        while (inputFile.hasNextInt()) {
            int number = inputFile.nextInt();
            if (number < lowest) {
                lowest = number;
            }
        }
        return lowest;
    }
/**
 * The getHighest
 * @return the highest element in the file
 * @throws FileNotFoundException 
 */
    public int getHighest() throws FileNotFoundException {
        File file = new File(FileN);
        Scanner inputFile = new Scanner(file);
        highest = inputFile.nextInt();
        while (inputFile.hasNextInt()) {
            int number = inputFile.nextInt();
            if (number > highest) {
                highest = number;
            }
        }
        return highest;
    }
/**
 * The getAverage method 
 * @return the average of the elements in the file
 * @throws FileNotFoundException 
 */
    public double getAverage() throws FileNotFoundException {
        average = Total / FileN.length();
        return average;
    }
}
