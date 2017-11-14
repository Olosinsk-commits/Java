package person;

/**
 * The Person class holds a person’s name,address, and telephone number.
 * Person and Customer Classes (#7)
 * @author olga.osinskaya
 */

public class Person {

    protected String personname;// to hold user's name
    protected String address;// to hold user's address 
    protected String phonenumber;//to hold user's phone number

    /**
     * The constructor sets the user's name, address and phone number
     *
     * @param name the user's name
     * @param adr the user's address
     * @param phone the user's phone number
     */
    public Person(String name, String adr, String phone) {
        personname = name;
        address = adr;
        phonenumber = phone;
    }

    /**
     * The non-arg constructor
     */
    public Person() {
        personname = "";
        address = "";
        phonenumber = "";
    }
    
    /**
     * The setPerson method sets the person data to the bellow fields
     * @param name the value stored in personname
     * @param adr the value stored in address
     * @param phone the value stored in phonenumber
     */

    public void setPerson(String name, String adr, String phone) {
        personname = name;
        address = adr;
        phonenumber = phone;
    }
/**
 * The getName method returns the name of persona
 * @return the name of persona
 */
    public String getName() {
        return personname;
    }
/**
 * The getAddress method returns the address of persona
 * @return address of persona
 */
    public String getAddress() {
        return address;
    }
/**
 * The getPhobe method returns persona phone number
 * @return phone number of persona
 */
    public String getPhone() {
        return phonenumber;
    }
}
