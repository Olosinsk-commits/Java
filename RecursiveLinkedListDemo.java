
package recursivelinkedlist;

/**
 *The RecursiveLinkedList class demonstrates a RecursiveLinkedList class.
 * @author olga.osinskaya
 */
public class RecursiveLinkedListDemo {

    public static void main(String[] args) {
        RecursiveLinkedList ll = new RecursiveLinkedList();
        ll.add("Amy");
        ll.add("Bob");
        ll.add("Yuka");
        ll.add(0, "Al");
        ll.add(2, "Beth");
        ll.add(4, "Carol");
        System.out.println("The members of the list are:");
        System.out.print(ll);
        System.out.println();
        System.out.println("\nReverse:");

        ll.reverse();

        System.out.print(ll);

        System.out.println();

        System.out.println("\nSort:");

        ll.sort();

        System.out.print(ll);

    }

}
