/*
Class PhoneBookEntry has fields for a person’s name and phone number. This
class has the constructor, accessor and mutator methods. 
Our program creates five PhoneBookEntry objects, stores them in an ArrayListse,
and displays the contents of each object in the ArrayList.
 */
package phonebookarray;

/**
 * Assignment 1 #17 Phone Book ArrayList
 * @author olga.osinskaya
 */
public class PhoneBookEntry {

//fields    
    String PersonName; 
    int PhoneNumber;
/**
 * default constructor
 */
    public PhoneBookEntry() {
        PersonName = "OlgaOsinskaya";
        PhoneNumber = 123456789;
    }
/**
 * Constructor
 * @param Persona the user's name
 * @param Phone the user's phone number
 */
    public PhoneBookEntry(String Persona, int Phone) {
        this.PersonName = Persona;
        this.PhoneNumber = Phone;
    }
/**
 * The method SetPersona sets the user's persona name and phone number
 * @param Persona the user's name
 * @param Phone the user's phone number
 */
    public void setPersona(String Persona, int Phone) {
        this.PersonName = Persona;
        this.PhoneNumber = Phone;
    }
/**
 * 
 * @return the user's name
 */
    public String getPersona() {
        return PersonName;

    }
/**
 * 
 * @return the user's phone
 */
    public int getPhone() {
        return PhoneNumber;

    }
/**
 * 
 * @return 
 */
    public String toString() {
        return "Name: " + PersonName + "; Phone: "
                + PhoneNumber;
    }

    

}
