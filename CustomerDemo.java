package person;

/**
 * This program demonstrate an object of the Customer class, which extends
 * the Person class.
 * Person and Customer Classes (#7)
 * @author olga.osinskaya
 */

public class CustomerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here     
        System.out.println("Spam list: ");
        //create a Customer object1
        Customer customer1 = new Customer(1, "Masha", "masha@mail.com", " (123)435-3456", true);
        //create a Customer object2
        Customer customer2 = new Customer(2, "Eric", "eric@mail.com", "(123)445-4444", false);
        //display results 
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
    }

}
