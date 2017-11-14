package preferredcustomer;

/**
 * This class determines the customer's discount level
 * Preferred Customer Class (#8)
 * 
 * @author olga.osinskaya
 */
public class PreferredCustomer extends Customer {

    double amount;//to hold the amount of the customer’s purchases
    String discountlevel;// to hold the customer’s discount level

    /**
     * The Constructor sets customer data in the below fields
     *
     * @param cnumber is holding the customer number
     * @param name the customer's name
     * @param address the customer's address
     * @param phone the phone number
     * @param w the wish to be in a spam lost
     * @param a the amount 
     */
    public PreferredCustomer(int cnumber, String name, String address, String phone, boolean w, double a) {
        this.amount = a;
        this.address = address;
        this.customernumber = cnumber;
        this.personname = name;
        this.phonenumber = phone;
        this.wish = w;
    }
/**
 * This method returns customer's name
 * @return personname
 */
    @Override
    public String getName() {
        return personname;
    }
/**
 * This method returns customer's email address
 * @return address
 */
    @Override
    public String getAddress() {
        return address;
    }
/**
 * This method returns customer's phone number
 * @return phonenumber
 */
    @Override
    public String getPhone() {
        return phonenumber;
    }
/**
 * This method determines and returns the customer’s discount percent
 * @return percent
 */
    public int getPersont() {
        int persent;
        if (amount >= 2000) {
            persent = 10;
        } else if (amount >= 1500) {
            persent = 7;
        } else if (amount >= 1000) {
            persent = 6;
        } else if (amount >= 500) {
            persent = 5;
        } else {
            persent = 0;
        }
        return persent;
    }
/**
 * The toString method returns the customer's information in string format
 * @return str
 */
    @Override
    public String toString() {
        // Create a string representing the object.
        String str = (customernumber + ", " + getName() + ", " + getAddress()
                + ",  " + getPhone() + ",  " + isWish() + ",\nTotal Purchase: " + amount + "  Discount:  "
                + getPersont() + "%\n");

        // Return the string.
        return str;

    }

}
