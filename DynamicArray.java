
package dynamicarray;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author olga.osinskaya
 */
public class DynamicArray {
    // The storage for the elements. 
    // The capacity is the length of this array.

    private int[] array;
    //This variable stores the number of “occupied” elements in the array.
    private int size;

    /**
     * 3. Constructor with parameter. The parameter defines the capacity of
     * initial array. Allocates array of given capacity, sets size field to 0.
     * In case the parameter given to constructor is less than 0,
     * IllegalArgumentException is being thrown.
     *
     * @param capacity
     */
    public DynamicArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Parameter is less than 0");
        }
        array = new int[capacity];
        size = 0;
    }

    /**
     * 4. Non-argument constructor. Allocates array of size 10, sets size field
     * to 0.
     */
    public DynamicArray() {
        array = new int[10];
        int[] obj = new int[10];
        size = 0;
    }

    /**
     * 5. returns the size – a number of occupied elements in the array.
     *
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * 6. int [] toArray() accessor returns the array. Make sure you DO NOT
     * return the private array field. Instead, allocate memory for the new
     * array, copy your array field into that new object
     * @return the new array
     */
    int[] toArray() {
        int[] newArray = Arrays.copyOf(array, array.length);
        return newArray;
    }

    /**
     * 7. adds a new element to the end of the array and increments the size
     * field. If the array is full, you need to increase the capacity of the
     * array: a. Create a new array with the size equal to double the capacity
     * of the original one. b. Copy all the elements from the array field to the
     * new array. c. Add the new element to the end of the new array. d. Use new
     * array as an array field
     *
     * @param num
     */
    public void push(int num) {
        if (getSize() == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size] = num;
        size++;
        //System.out.println(Arrays.toString(array));
    }

    /**
     * 8. removes the last element of the array and returns it. Decrements the
     * size field. If the array is empty a RuntimeException with the message
     * “Array is empty” must be thrown. At this point check the capacity of the
     * array. If the capacity is 4 times larger than the number of occupied
     * elements (size), it is time to shrink the array: a. Create a new array
     * with the size equal to half of the capacity of the original one. b. Copy
     * all the elements from the array field to the new array. c. Use new array
     * as an array field.
     *
     * @return
     * @throws RuntimeException
     */
    public int pop() throws RuntimeException {
        if (size == 0) {
            throw new IllegalArgumentException("Array is empty!!!");
        }
        if (size * 4 == array.length) {
            array = Arrays.copyOf(array, array.length / 2);
        }
        size--;
        System.out.println("Last element of the array is: " + array[size]);
        return array[size];
    }

    /**
     * 9. returns element of the array with the requested index. If the index
     * provided is too large or negative, the IndexOutOfBoundsException is
     * thrown with the message “Illegal index”.
     *
     * @param index
     * @return
     * @throws IndexOutOfBoundsException
     */
    int get(int index) throws IndexOutOfBoundsException {

        if (index >= array.length || index < 0) {
            throw new IllegalArgumentException("Index out of range!!!");
        } else {
            System.out.println("Array by index " + index + " is: " + array[index]);
            return array[index];
        }
    }

    /**
     * 10. 
     * @param key
     * @return returns the index of the first occurrence of the given number.
     * Returns -1 when the number is not found.
     */
    int indexOf(int key) {

        for (int i = 0; i < size; i++) {
            if (array[i] == key) {
                System.out.println("Number " + key + " at index " + i);
                return i;
            }
        }
        System.out.println("Number not found!");
        return -1;

    }

    /**
     * 11.adds a new element to the location of the array specified by index
     * parameter. If the index is larger than size of the array or less than
     * 0,IndexOutOfBoundsException is thrown. When adding the element into the
     * middle of the array, you’ll have to shift all the elements to the right
     * to make room for the new one. If the array is full and there is no room
     * for a new element, the array must be doubled in size. Please follow the
     * steps listed in the push() method description to double the capacity of
     * the array.
     *
     * @param index
     * @throws IndexOutOfBoundsException
     */
    void add(int index) throws IndexOutOfBoundsException {
        Scanner in = new Scanner(System.in);
        if (index >= array.length || index < 0) {
            throw new IllegalArgumentException("Index out of range!!!");
        }
        if (getSize() == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        System.out.println("Enter element:");
        int newValue = in.nextInt();
        for (int i = size - 1; i >= index - 1; i--) {
            array[i + 1] = array[i];
        }
        array[index] = newValue;
        size++;
        System.out.println(Arrays.toString(array));

    }

    /**
     * 12.removes the element at the specified position in this array. When the
     * element is removed from the middle of the array, all the elements must be
     * shifted to close the gap created by removed element. If the index value
     * passed into the method is more or equal to the size or less than 0 the
     * IndexOutOfBoundsException must be thrown. At this point check the
     * capacity of the array. If the capacity is 4 times larger than the number
     * of occupied elements (size), it is time to shrink the array.
     *
     * @param index
     * @return
     * @throws IndexOutOfBoundsException
     */
    int remove(int index) throws
            IndexOutOfBoundsException {
        if (size == 0) {
            throw new IllegalArgumentException("Array is empty!!!");
        }
        if (size * 4 == array.length) {
            array = Arrays.copyOf(array, array.length / 2);
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        System.out.println(Arrays.toString(array));
        return array[index];

    }

    /**
     * 13.
     *
     * @return true if the size of the array is 0.
     */
    boolean isEmpty() {
        if (size == 0) {
            System.out.print("Array is empty");
            return false;
        }
        System.out.print("Array is not empty");
        return true;
    }

    /**
     * 14. sorts the elements of the array.
     */
    void sort() {

        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
        }
    }

    /**
     * 15.
     *
     * @return the smallest element in the array. If the array is empty
     * @throws RuntimeException
     */
    int findMin() throws RuntimeException {
        int min = Integer.MAX_VALUE;
        if (size <= 0) {
            throw new IllegalArgumentException("Index out of range!!!");
        } else {
            for (int i = 0; i < size; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            System.out.println("Minimum = " + min);
        }
        return min;

    }

    /**
     * 16.
     *
     * @return the largest element in the array. If the array is empty throws
     * RuntimeException
     * @throws RuntimeException
     */
    int findMax() throws RuntimeException {

        int max = Integer.MIN_VALUE;
        if (size <= 0) {
            throw new IllegalArgumentException("Index out of range!!!");
        } else {
            for (int i = 0; i < size; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            System.out.println("Maximum = " + max);
        }
        return max;
    }

    /**
     * 17.
     *
     * @return an array as a string of comma-separated values
     */
    public String toString() {
        System.out.println(Arrays.toString(array));
        return Arrays.toString(array);
    }

    /**
     * 18. compares two objects (this one and the one passed as parameter)
     * element-by-element and determines if they are exactly the same. The
     * capacity of two compared objects is not being compared.
     *
     * @param obj
     * @return
     */
    boolean equals(DynamicArray obj) {
        int[] array2 = obj.toArray();
        if (size != array2.length) {
            System.out.println("Arrays are not equals! Size is different!");
            return false;
        }

        for (int i = 0; i <= array.length; i++) {
            if (array[i] != array2[i]) {
                System.out.println("Arrays are not equals!");
                return false;
            }

        }
        System.out.println("Arrays are equals!");
        return true;
    }
}

