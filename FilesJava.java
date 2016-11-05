package files.java;

import java.io.*;  // Needed for File I/O classes
import java.util.Random;

/**
 * @author olga.osinskaya
 */
public class FilesJava {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // get the file name to writing, range from and range to, Number of random numbers to be generated
        randomNumsFile("Numbers", 5, 80, 10);
        // Get the file name reading and the file name for writing 
        getTotalSales("Numbers", "number_out");
    }

    /**
     * The randomNumsFile generates random numbers and saves them in a file,
     * placing each new number on a new line.
     *
     * @param fileName - file name.
     * @param rangeFrom - The "from" for range of random numbers
     * @param rangeTo - The "to" for range of random numbers
     * @param howMany -Number of random numbers to be generated
     * @throws FileNotFoundException
     */

    private static void randomNumsFile(String fileName, int rangeFrom, int rangeTo, int howMany) throws FileNotFoundException {
        // Create a Scanner object for keyboard input.
        // Open the file.
        if (rangeFrom > rangeTo) {
            throw new IllegalArgumentException("Start cannot exceed End.");
        }
        PrintWriter outputFile = new PrintWriter(fileName);
        // Create a Random object to generate random numbers.
        Random random = new Random();
        for (int idx = 1; idx <= howMany; ++idx) {
            //get the range, casting to long to avoid overflow problems
            long range = (long) rangeTo - (long) rangeFrom + 1;
            // compute a fraction of the range, 0 <= frac < range
            long fraction = (long) (range * random.nextDouble());
            int randomNumber = (int) (fraction + rangeFrom);
            outputFile.println(randomNumber);
        }
        // Close the file.
        outputFile.close();
    }

    /**
     * The randomNumsFile method analyzes the sequence of integers stored in a
     * file
     *
     * @param filename - the name of file which we open for reading.
     * @param outputFileName the name of file which we user for writing.
     * @throws IOException
     */

    static void getTotalSales(String filename, String outputFileName) throws IOException {
        int sum = 0; //To hold total 
        int num = 0, max = 0, min = 0; // To hold num, max, min
        int count = 0; //To hold count
        // Open the file.
        Reader newfile = new BufferedReader(new FileReader(filename));
        StreamTokenizer stok = new StreamTokenizer(newfile);
        stok.parseNumbers();
        // Read all of the values from the file
        stok.nextToken();
        while (stok.ttype != StreamTokenizer.TT_EOF) {
            if (stok.ttype == StreamTokenizer.TT_NUMBER) {
                // The sum of integers. Add the number to sum.
                sum += stok.nval;
                // Compare numbers. Get the greatest and the smallest numbers 
                if (count == 0) {
                    max = (int) stok.nval;
                    min = (int) stok.nval;
                } else if (stok.nval > max) {
                    max = (int) stok.nval;
                } else if (stok.nval < min) {
                    min = (int) stok.nval;
                }
                // count the integers
                count++;
            } else {
                System.out.println("Nonnumber: " + stok.sval);
            }
            stok.nextToken();
        }
        try {
            //Open the new file "number_out.txt" 
            PrintWriter outputFile = new PrintWriter(outputFileName);
            // Write the data to the new file "outputFileName".
            outputFile.println("Numeric data file name:              " + filename);
            outputFile.println("Number of integers:                  " + count);
            outputFile.println("The total of all integers in file:   " + sum);
            outputFile.println("The largest integer in the set:      " + max);
            outputFile.println("The smallest integer in the set:     " + min);

            outputFile.close();  // Close the file.
        } catch (IOException e) {
            System.out.printf("ERROR writing to file %s!", outputFileName);
        }

    }
}

