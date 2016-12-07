package dynamicarray;

import java.util.Scanner;

/**
 *
 * @author olga.osinskaya
 */
public class ArrayDemo {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Dynamic Array Test:");
        DynamicArray obj = new DynamicArray(2);
        obj.push(6);
        obj.push(6);

        DynamicArray dArray = new DynamicArray(2);

        char ch = 0;
        /*  Perform Dynamic Array operations */
        do {
            System.out.println("1.(push)     Insert number to array.");
            System.out.println("2.(pop)      Removes the last element of the array.");
            System.out.println("3.(get)      Element by index.");
            System.out.println("4.(indexOf)  Returns the index of the first occurrence of the given number.");
            System.out.println("5.(add)      Adds a new element to the location of the array specified by index parameter. ");
            System.out.println("6.(remove)   Removes the element at the specified position in this array.  ");
            System.out.println("7.(isEmpty)  Returns true if the size of the array is 0");
            System.out.println("8.(sort)     Sorts the elements of the array");
            System.out.println("9.(findMin)  Returns the smallest element in the array.");
            System.out.println("10.(findMax) Returns the largest element in the array.");
            System.out.println("11.(toString)Returns an array as a string of comma-separated values. ");
            System.out.println("12.(equals)  Compares two objects");
            System.out.println("What do you want? => ");
            try {
                int choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter number: ");
                        dArray.push(scan.nextInt());//7
                        dArray.toString();
                        break;
                    case 2:
                        System.out.println();
                        dArray.pop(); //8
                        break;
                    case 3:
                        System.out.println("Enter index: ");
                        dArray.get(scan.nextInt());//9
                        break;
                    case 4:
                        System.out.println("\nEnter number: ");//10 -index of the first occurrence of the given number.
                        dArray.indexOf(scan.nextInt());
                        break;
                    case 5:
                        System.out.println("Enter index: ");
                        dArray.add(scan.nextInt()); //11 
                        break;
                    case 6:
                        System.out.println("Inter index: ");
                        dArray.remove(scan.nextInt());//12
                        break;
                    case 7:
                        System.out.println();//13
                        dArray.isEmpty();
                        break;
                    case 8:
                        System.out.println("Sort an Array: ");
                        dArray.sort();//14
                        break;
                    case 9:
                        System.out.println("\nEnter number: ");//15
                        dArray.findMin();
                        break;
                    case 10:
                        System.out.println("Enter ");
                        dArray.findMax();//16
                        break;
                    case 11:
                        System.out.println("Your array is: ");//17
                        dArray.toString();
                        break;
                    case 12:
                        //System.out.println("");
                        dArray.equals(obj);
                        System.out.println("");
                        break;
                    default:
                        System.out.println("Wrong Entry \n ");
                        break;
                }
                //dArray.display();
            } catch (Exception e) // handle the exception below
            {
                System.out.println(e.getMessage());
                // throws the Exception
            }
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch != 'N' || ch != 'n');

    }

}

