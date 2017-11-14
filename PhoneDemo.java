/*
Class PhoneBookEntry has fields for a person’s name and phone number. This
class has the constructor, accessor and mutator methods. 
Our program creates five PhoneBookEntry objects, stores them in an ArrayListse,
and displays the contents of each object in the ArrayList.
 */
package phonebookarray;

import java.util.ArrayList;
import java.util.List;

/**
 * Assignment 1 #17 Phone Book ArrayList
 * @author olga.osinskaya
 */
public class PhoneDemo {

    public static void main(String[] args) {

//create instanse of class
        ArrayList<PhoneBookEntry> phoneList = new ArrayList<PhoneBookEntry>();
//five PhoneBookEntry objects and stores them in an ArrayList
        phoneList.add(new PhoneBookEntry("Olga", 0123456));
        phoneList.add(new PhoneBookEntry("Sergey", 0123456));
        phoneList.add(new PhoneBookEntry("Masha", 0123456));
        phoneList.add(new PhoneBookEntry("Natasha", 0123456));
        phoneList.add(new PhoneBookEntry("Glasha", 0123456));
//display the contents of each object in the ArrayList
        for (int index = 0; index < phoneList.size(); index++) {
            System.out.println((index + 1) + " " + phoneList.get(index).toString());
        }

    }
}
