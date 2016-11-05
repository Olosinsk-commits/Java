import java.io.*; // Needed for File I/O classes
import java.util.Random;

/**
 * @author olga.osinskaya
 */

public final class Test_2 {

    public static final void main(String... aArgs) throws IOException {
        // call the randomNumsFile method  
        randomNumsFile("Numbers", 5, 8, 10);
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
}

