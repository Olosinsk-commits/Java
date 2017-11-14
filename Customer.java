package person;

/**
 * This class extends the Person class for customer's wishes to be on a mailing list.
 * Person and Customer Classes (#7)
 * @author olga.osinskaya
 */

public class Customer extends Person {


    int customernumber;//to hold the customer number
    boolean wish;//indicating whether the customer wishes to be on a 
//mailing list
    String iswish;
/**
 * The constructor sets the person's data to the bellow fields
 * @param cnumber the person's customer number
 * @param name the person's name
 * @param address the person's address 
 * @param phone the person's phone number
 * @param w the boolean wishes
 */
    public Customer(int cnumber, String name, String address, String phone, boolean w) {
        super.setPerson(name, address, phone);
        this.customernumber = cnumber;
        this.wish = w;
    }
/**
 * The non-arg constructor 
 */
    public Customer() {
        this.customernumber = 1;
        this.wish = true;
    }
/**
 * The setWish method sets the boolean wishes 
 * @param wishes the boolean value to store in wish
 */
    public void setWish(boolean wishes) {
        this.wish = wishes;
    }
/**
 * The getWish method returns the boolean wish
 * @return the customer's wish
 */
    public boolean getWish() {
        if (wish == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        return wish;
    }
/**
 * The isWish method returns the wish in string format
 * @return iswish 
 */
    public String isWish() {
        if (wish == true) {
            iswish = "Yes";
        } else {
            iswish="No";
        }
        return iswish;
    }
/**
 * The toString method returns the customer's information in string format
 * @return str
 */
    public String toString() {
        // Create a string representing the object.
        String str = (customernumber + ", " + getName() + ", " + getAddress() + ", " + getPhone() + ", " + isWish());

        // Return the string.
        return str;

    }

}