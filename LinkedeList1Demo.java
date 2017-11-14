package linkedlist1;

/**
 * The LinkedList1 class implements a Linked list.
 *
 * @author olga.osinskaya
 */
public class LinkedeList1Demo {

    public static void main(String[] args) {

        LinkedList1 ll = new LinkedList1();
        ll.add("Aby");
        ll.add("Amy");
        ll.add("Amy");
        ll.add("Bob");
        ll.add(0, "Al");
        ll.add(2, "Beth");
        ll.add(4, "Carol");
        ll.add(5, "Farol");
        System.out.println("The members of the list are:");
        System.out.print(ll);
        ll.sort();
        System.out.println();
        System.out.println("\nSort:");
        System.out.print(ll);
        System.out.println();
        System.out.println("\nReverse:");
        ll.reverse();
        System.out.print(ll);
        System.out.println("");

    }
}
