
package recursivelinkedlist;

/**
 * The RecursiveLinkedList class implements a Linked list.
 * @author olga.osinskaya
 */
public class RecursiveLinkedList {

    /**
     * The Node class stores a list element and a reference to the next node.
     */
    private class Node {

        String value;
        Node next;

        /**
         * Constructor.
         *
         * @param val The element to store in the node.
         * @param n The reference to the successor node.
         */
        Node(String val, Node n) {
            value = val;
            next = n;
        }

        /**
         * Constructor.
         *
         * @param val The element to store in the node.
         */
        Node(String val) {
            // Call the other (sister) constructor.
            this(val, null);
        }
    }

    private Node first;  // list head
    private Node last;   // last element in list

    /**
     * Constructor.
     */
    public RecursiveLinkedList() {
        first = null;
        last = null;
    }

    /**
     * The isEmpty method checks to see if the list is empty.
     *
     * @return true if list is empty, false otherwise.
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * The size method returns the length of the list.
     *
     * @return The number of elements in the list.
     */
    public int size() {
        int count = 0;
        Node p = first;
        while (p != null) {
            // There is an element at p
            count++;
            p = p.next;
        }
        return count;
    }

    /**
     * The add method adds an element to the end of the list.
     *
     * @param e The value to add to the end of the list.
     */
    public void add(String e) {
        if (isEmpty()) {
            first = new Node(e);
            last = first;
        } else {
            // Add to end of existing list
            last.next = new Node(e);
            last = last.next;
        }
    }

    /**
     * The add method adds an element at a position.
     *
     * @param e The element to add to the list.
     * @param index The position at which to add the element.
     * @exception IndexOutOfBoundsException When index is out of bounds.
     */
    public void add(int index, String e) {
        if (index < 0 || index > size()) {
            String message = String.valueOf(index);
            throw new IndexOutOfBoundsException(message);
        }

        // Index is at least 0
        if (index == 0) {
            // New element goes at beginning
            first = new Node(e, first);
            if (last == null) {
                last = first;
            }
            return;
        }

        // Set a reference pred to point to the node that
        // will be the predecessor of the new node
        Node pred = first;
        for (int k = 1; k <= index - 1; k++) {
            pred = pred.next;
        }

        // Splice in a node containing the new element
        pred.next = new Node(e, pred.next);

        // Is there a new last element ?
        if (pred.next.next == null) {
            last = pred.next;
        }
    }

    /**
     * The toString method computes the string representation of the list.
     *
     * @return The string form of the list.
     */
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();

        // Use p to walk down the linked list
        Node p = first;
        while (p != null) {
            strBuilder.append(p.value + " ");
            p = p.next;
        }
        return strBuilder.toString();
    }

    /**
     * The remove method removes the element at an index.
     *
     * @param index The index of the element to remove.
     * @return The element removed.
     * @exception IndexOutOfBoundsException When index is out of bounds.
     */
    public String remove(int index) {
        if (index < 0 || index >= size()) {
            String message = String.valueOf(index);
            throw new IndexOutOfBoundsException(message);
        }

        String element;  // The element to return     
        if (index == 0) {
            // Removal of first item in the list
            element = first.value;
            first = first.next;
            if (first == null) {
                last = null;
            }
        } else {
            // To remove an element other than the first,
            // find the predecessor of the element to
            // be removed.
            Node pred = first;

            // Move pred forward index - 1 times
            for (int k = 1; k <= index - 1; k++) {
                pred = pred.next;
            }

            // Store the value to return
            element = pred.next.value;

            // Route link around the node to be removed
            pred.next = pred.next.next;

            // Check if pred is now last
            if (pred.next == null) {
                last = pred;
            }
        }
        return element;
    }

    /**
     * The remove method removes an element.
     *
     * @param element The element to remove.
     * @return true if the remove succeeded, false otherwise.
     */
    public boolean remove(String element) {
        if (isEmpty()) {
            return false;
        }

        if (element.equals(first.value)) {
            // Removal of first item in the list
            first = first.next;
            if (first == null) {
                last = null;
            }
            return true;
        }

        // Find the predecessor of the element to remove
        Node pred = first;
        while (pred.next != null
                && !pred.next.value.equals(element)) {
            pred = pred.next;
        }

        // pred.next == null OR pred.next.value is element
        if (pred.next == null) {
            return false;
        }

        // pred.next.value  is element
        pred.next = pred.next.next;

        // Check if pred is now last
        if (pred.next == null) {
            last = pred;
        }

        return true;
    }

/**
 * The reverse method reverses the order of the elements in the list.
 * @param head -the first element in the list
 * @return 
 */
    public Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        //get second node    
        Node second = head.next;
        //set first's next to be null
        head.next = null;

        Node rest = reverse(second);
        second.next = head;

        return rest;
    }

    public void reverse() {
        first = reverse(first);
    }
/**
 * The sort method rearranges the elements in the list so they are sorted in alphabetical order.
 * @param head - first element in the list 
 * @return 
 */
    public Node sort(Node head){
    if(head == null || head.next == null)
        return head;//There is no need for processing

    String max = head.value;
    Node prev = head;
    Node to_move = null;
    Node tmp = head.next;

    //find maximum value in rest(head->next)
    while(tmp != null) {
         if (tmp.value.compareTo(prev.value) < 0) {
            max = tmp.value;
            to_move = prev;//save previous node for remove link
        }
        prev = tmp;
        tmp = tmp.next;
    }

    if(to_move == null) {//not find in rest
        head.next = sort(head.next);
        return head;
    }

    prev = to_move;
    to_move = prev.next;//max node
    prev.next = prev.next.next;//max node remove from link
    to_move.next = sort(head);
    return to_move;
}
    
    public void sort() {
        first = sort(first);
    }
}
