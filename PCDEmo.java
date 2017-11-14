package preferredcustomer;

/**
 * This program demonstrates the PreferredCustomer class, which extends the Customer
 * class
 * Preferred Customer Class (#8)
 * @author olga.osinskaya
 */
public class PCDEmo {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here     
        System.out.println("Customers list:\n ");
        //Create the PreferredCustomer objects 
        PreferredCustomer customer1 = new PreferredCustomer(1, "Masha", "masha@mail.com", " (123)435-3456", true,1000);
        PreferredCustomer customer2 = new PreferredCustomer(2, "Eric", "eric@mail.com", "(123)445-4444", false,4000);
        PreferredCustomer customer3 = new PreferredCustomer(3, "Eric", "eric@mail.com", "(123)445-4444", false,400);
        //display the test results 
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
        System.out.println(customer3.toString());
    }

}
