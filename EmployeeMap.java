/*
   This program stores mappings in a HashMap and then
   searches for various objects.
 */
package employeemap;

import java.util.*;

/**
 *
 * @author olga.osinskaya
 */
public class EmployeeMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String id;
        // Create a HashMap to store Employee objects.
        Map<String, Employee> EmployeeMap = new HashMap<>();
        // Create some Car objects.
        Employee user1 = new Employee("1", "Mariia");
        Employee user2 = new Employee("2", "Natalia");
        Employee user3 = new Employee("3", "Sonya");
        Employee user4 = new Employee("4", "Mishel");

        // Put some mappings into the HashMap. In each
        // mapping, the Employee's ID is the key and the
        // Employee object containing that ID is the value.
        EmployeeMap.put(user1.getID(), user1);
        EmployeeMap.put(user2.getID(), user2);
        EmployeeMap.put(user3.getID(), user3);
        EmployeeMap.put(user4.getID(), user4);

        System.out.println("Please, enter employee's ID number: ");
        Scanner keyboard = new Scanner(System.in);
        id = keyboard.nextLine();

//        // Search for the Employee by their ID.
//        System.out.println("\nSearching for the Employee with "
//                + "ID: " + id);
        Employee foundemployee = EmployeeMap.get(id);
        // If the car was found, display it.
        if (foundemployee != null) {
            System.out.println(foundemployee);
        } else {
            System.out.println("This employee's ID number is NOT in the set.");
        }

    }
}
