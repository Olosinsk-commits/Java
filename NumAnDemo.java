package numberanalyzer;

/**
 * The NumAnDemo class demonstrates the generic NumberAnalyzer class
 *
 * @author olga.osinskaya
 */
public class NumAnDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create new array
        Double[] numberLists = {1.0, 2.0, 3.0, 0.99, 56.0};
        //create instance 
        NumberAnalyzer<Double> arrayOne = new NumberAnalyzer<Double>(numberLists);
        // Display the results
        System.out.println("The total: " + arrayOne.getTotal());
        System.out.println("The highest: " + arrayOne.largest());
        System.out.println("The lowest: " + arrayOne.lowest());
        System.out.println("The Average: " + arrayOne.getAverage());

    }

}
