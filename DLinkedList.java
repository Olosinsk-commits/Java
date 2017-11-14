package dlinkedlist;

/**
 * #1. Generic Linked Lists
 * This class shows double linked class and their methods
 * @author olga.osinskaya
 */
/**
 * The DLinkedList class implements a doubly Linked list.
 */
class DLinkedList {

    /**
     * The Node class stores a list element and a reference to the next node.
     */
    private class Node {

        Double value;   // Value of a list element
        Node next;      // Next node in the list
        Node prev;      // Previous element in the list

        /**
         * Constructor.
         *
         * @param val The element to be stored in the node.
         * @param n The reference to the successor node.
         * @param p The reference to the predecessor node.
         */
        Node(Double val, Node n, Node p) {
            value = val;
            next = n;
            prev = p;
        }

        /**
         * Constructor.
         *
         * @param val The element to be stored in the node.
         */
        Node(Double val) {
            // Just call the other (sister) constructor
            this(val, null, null);
        }
    }

    private Node first;   // Head of the list
    private Node last;    // Last element on the list 

    /**
     * Constructor.
     */
    public DLinkedList() {
        first = null;
        last = null;
    }

    /**
     * The clear methods removes all elements from the list.
     */
    public void clear() {
        while (size() > 0) {
            remove(0);
        }
    }

    /**
     * The get method takes index as argument and return data at index
     *
     * @param index of element
     * @return element at required index
     */
    public Double get(int index) {
        Node current = first;
        int count = 0;
        /* index of Node we are
                          currently looking at */
        while (current != null) {
            if (count == index) {
                return current.value;
            }
            count++;
            current = current.next;
        }

        /* if we get to this line, the caller was asking
        for a non-existent element so we assert fail */
        assert (false);
        return null;
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
     * The add method adds to the end of the list.
     *
     * @param e The value to add.
     */
    public void add(Double e) {
        if (isEmpty()) {
            last = new Node(e);
            first = last;
        } else {
            // Add to end of existing list
            last.next = new Node(e, null, last);
            last = last.next;
        }
    }

    /**
     * This add method adds an element at an index.
     *
     * @param e The element to add to the list.
     * @param index The index at which to add.
     * @exception IndexOutOfBoundsException When the index is out of bounds.
     */
    public void add(int index, Double e) {
        if (index < 0 || index > size()) {
            String message = String.valueOf(index);
            throw new IndexOutOfBoundsException(message);
        }

        // Index is at least 0
        if (index == 0) {
            // New element goes at beginning
            Node p = first;            // Old first
            first = new Node(e, p, null);
            if (p != null) {
                p.prev = first;
            }
            if (last == null) {
                last = first;
            }
            return;
        }

        // pred will point to the predecessor
        // of the new node.
        Node pred = first;
        for (int k = 1; k <= index - 1; k++) {
            pred = pred.next;
        }

        // Splice in a node with the new element
        // We want to go from  pred-- succ to 
        // pred--middle--succ
        Node succ = pred.next;
        Node middle = new Node(e, succ, pred);
        pred.next = middle;
        if (succ == null) {
            last = middle;
        } else {
            succ.prev = middle;
        }
    }

    /**
     * The toString method computes the string representation of the list.
     *
     * @return The string representation of the linked list.
     */
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();

        // Use p to walk down the linked list
        Node p = first;
        while (p != null) {
            strBuilder.append(p.value + ", ");
            p = p.next;
        }
        return strBuilder.toString();
    }

    /**
     * The remove method removes the element at a given position.
     *
     * @param index The position of the element to remove.
     * @return The element removed.
     * @exception IndexOutOfBoundsException When index is out of bounds.
     */
    public Double remove(int index) {
        if (index < 0 || index >= size()) {
            String message = String.valueOf(index);
            throw new IndexOutOfBoundsException(message);
        }

        // Locate the node targeted for removal
        Node target = first;
        for (int k = 1; k <= index; k++) {
            target = target.next;
        }

        Double element = target.value;  // Element to return
        Node pred = target.prev;        // Node before the target
        Node succ = target.next;        // Node after the target

        // Route forward and back pointers around
        // the node to be removed
        if (pred == null) {
            first = succ;
        } else {
            pred.next = succ;
        }

        if (succ == null) {
            last = pred;
        } else {
            succ.prev = pred;
        }

        return element;
    }

    /**
     * The remove method removes an element from the list.
     *
     * @param element The element to remove.
     * @return true if the element was removed, false otherwise.
     */
    public boolean remove(Double element) {
        if (isEmpty()) {
            return false;
        }

        // Locate the node targeted for removal
        Node target = first;
        while (target != null
                && !element.equals(target.value)) {
            target = target.next;
        }

        if (target == null) {
            return false;
        }

        Node pred = target.prev;        // Node before the target
        Node succ = target.next;        // Node after the target

        // Route forward and back pointers around
        // the node to be removed
        if (pred == null) {
            first = succ;
        } else {
            pred.next = succ;
        }

        if (succ == null) {
            last = pred;
        } else {
            succ.prev = pred;
        }

        return true;
    }

    public double set(int index, double element) {
        // check for bounds
        if (index < 0 || index >= size()) {
            String message = String.valueOf(index);
            throw new IndexOutOfBoundsException(message);
        }

        Node item = first;
        int i = 0;
        Double retval = null; // the return value

        // go to the proper node
        while (i != index) {
            item = item.next;
            i++;
        }
        // get the current value
        retval = item.value;
        // replace it
        item.value = element;

        // return the old value
        return get(index - 1);
    }

    public static void main(String[] args) {
        int index2 = 3;//index at the list
        int index = 1;
        double element = 4.0;
        DLinkedList ll = new DLinkedList();
        //add items to dlinked list
        ll.add(1.2);
        ll.add(3.0);
        ll.add(0, 1.3);
        ll.add(2, 2.3);
        ll.add(4, 2.5);
        //print list
        System.out.println("1.The elements of the list are:");
        System.out.println("List: " + ll);
        System.out.println();
        System.out.println("2.The element at index " + (index2 + 1) + " is: " + ll.get(index2));
        System.out.println();

        System.out.println("3.Replacing the element at the specified position with the specified\n"
                + "element. Index: "+index+ ". Element: "+element);
        System.out.println();
        System.out.println("Previous element is: " + ll.set(index, element));
        System.out.println();

        System.out.println("List: " + ll);
        System.out.println();
        //remove all elements from list
        ll.clear();
        System.out.println("4.Removing all elements from the list.");
        System.out.println("List: " + ll);

    }
}
