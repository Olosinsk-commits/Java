package mylist;

import java.util.ArrayList;

/**
 * (Chapt 18, #1) MyListClass Class The generic class named MyList, with a type
 * parameter T. The type parameter T is constrained to an upper bound: the
 * Number class. The class has as a field an ArrayList of T.
 *
 * @author olga.osinskaya
 */
public class MyList<T extends Number> {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MyList<Integer> myTest = new MyList<Integer>();

//add stuff to the list
        myTest.add(3);
        myTest.add(2);
        myTest.add(0);
        myTest.add(-12);
        myTest.add(802);

//output largest
        System.out.println("Largest Number is:" + myTest.largest());
        System.out.println("Smalles Number is:" + myTest.smallest());
        // TODO code application logic here
    }
    ArrayList<T> numbers = new ArrayList<T>();

    /**
     * The public method named add accepts a parameter of type T. When an
     * argument is passed to the method, it is added to the ArrayList.
     *
     * @param x
     */
    public void add(T x) {
        numbers.add(x);
    }

    /**
     * This method returns the largest
     *
     * @return value - largest
     */
    public T largest() {
        T value = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i).doubleValue() > value.doubleValue()) {
                value = numbers.get(i);
            }
        }
        return value;
    }

    /**
     * This method returns the smallest
     *
     * @return value -smallest
     */
    public T smallest() {
        T value = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i).doubleValue() < value.doubleValue()) {
                value = numbers.get(i);
            }
        }
        return value;
    }
}
