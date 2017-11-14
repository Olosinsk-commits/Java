/*
 The constructor should accept an array
of such objects. The class should have methods that return the highest
and lowest values in the array, the total of the elements, and the average
value of all the elements. Demonstrate the class in an application.
 */
package numberanalyzer;

/**
 * This generic class with a type parameter constrained to the Number class or
 * any subclass of Number. (Chapt 18, #7) Number Analyzer
 *
 * @author olga.osinskaya
 */
public class NumberAnalyzer<T extends Number> {

    private final T[] array;

    /**
     * The constructor accepts an array of T objects.
     *
     * @param Array
     */
    public NumberAnalyzer(T[] Array) {
        this.array = Array;

    }

    /**
     * This method returns the Total
     * @return total
     */
    public Double getTotal() {
        double total = 0;

        for (int index = 0; index < array.length; index++) {
            total += array[index].doubleValue();
        }

        return total;
    }

    /**
     * This method returns the highest
     * @return highest
     */
    public T largest() {
        T value = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].doubleValue() > value.doubleValue()) {
                value = array[i];
            }
        }
        return value;
    }

    /**
     * This method returns the lowest
     * @return the lowest
     */
    public T lowest() {
        T value = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].doubleValue() < value.doubleValue()) {
                value = array[i];
            }
        }
        return value;
    }

    /**
     * This method returns the average
     * @return the average
     */
    public Double getAverage() {
        Double value = getTotal() / array.length;

        return value;
    }
}
