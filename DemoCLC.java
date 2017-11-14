/*
The DemoCLC demonstrates how the CLinkedClass works
 */
package clinkedclass;

/**
 *
 * @author olga.osinskaya
 */
public class DemoCLC {

    public static void main(String[] args) {
        CLinkedClass ll = new CLinkedClass();
        ll.add("Amy");
        ll.add("Bob");
        ll.add("Al");
        ll.add("Beth");
        ll.add("Carol");
        ll.add(3, "Tarol");
        System.out.println("The members of the list are:");
        System.out.println(ll);
        ll.remove(0);
        System.out.println("\nThe members of the list are:");
        System.out.println(ll);
        ll.remove("Carol");
        System.out.println("\nThe members of the list are:");
        System.out.println(ll);
    }

}
