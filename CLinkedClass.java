package clinkedclass;

/**
 * This CLinkedClass class shows Circular Linked list implementation
 * @author olga.osinskaya
 */
public class CLinkedClass<T> {

    private Node<T> first;   // List head   
    private Node<T> last;   // List head 

    /**
     * Constructor.
     */
    public CLinkedClass() {
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
        if (first == null) {
            return count;
        } else {
            Node<T> temp = first;
            do {
                temp = temp.getNextNode();
                count++;
            } while (temp != first);
        }
        return count;
    }

    /**
     * The add method adds an element to the end of the list.
     *
     * @param e The value to add to the end of the list.
     */
    public void add(T e) {
        Node<T> newnode = new Node(e);
        if (first == null) {
            newnode.setNextNode(newnode);
            newnode.setPrevNode(newnode);
            first = newnode;
        } else {
            Node<T> temp = first.getPrevNode();
            temp.setNextNode(newnode);
            newnode.setNextNode(first);
            first.setPrevNode(newnode);
            newnode.setPrevNode(temp);
        }

    }

    /**
     * This method adds a node containing e to position index to the list
     *
     * @param e element
     * @param index
     */
    public void add(int index, T e) {
        if (index < 0 || index == 0) {
            add(e);
        } else {

            Node<T> temp = first;
            Node<T> newnode = new Node(e);
            for (int i = 0; i < index; i++) {
                temp = temp.getNextNode();
            }

            newnode.setNextNode(temp.getNextNode());
            temp.getNextNode().setPrevNode(newnode);
            temp.setNextNode(newnode);
            newnode.setPrevNode(temp);
        }
    }

    /**
     * The toString method computes the string representation of the list.
     *
     * @return a comma delimited string of the list elements
     */
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();

        // Use p to walk down the linked list
        Node<T> p = first;
        if (size() == 0) {
            System.out.println("List is empty! ");
        } else {

            for (int i = 0; i <= size() - 1; i++) {
                System.out.print(p.getData() + ", ");
                p = p.getNextNode();
            }

        }
        return strBuilder.toString();
    }

    /**
     * This method removes the node at index from the list
     *
     * @param index
     * @return
     */
    public T remove(int index) {
        T value = null;
        if (index == 0) {
            value = first.getData();
            Node<T> tempB = first.getNextNode();
            first.getPrevNode().setNextNode(tempB);
            first.setPrevNode(first.getPrevNode());
            first = tempB;

        } else if (index == size() - 1) {
            value = first.getPrevNode().getData();
            Node<T> tempE = first.getPrevNode();
            tempE.getPrevNode().setNextNode(first);
            first.setPrevNode(tempE.getPrevNode());
            tempE = null;
        } else {
            Node<T> temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.getNextNode();
            }
            value = temp.getData();
            Node<T> node = temp.getNextNode();
            node.setPrevNode(temp.getPrevNode());
            temp.getPrevNode().setNextNode(node);
            temp = null;
        }
        return value;// Deleted node's data
    }

    /**
     * The remove method removes an element from the list.
     *
     * @param element The element to remove.
     * @return true if the element was removed, false otherwise.
     */
    public boolean remove(T element) {
        if (isEmpty()) {
            return false;
        }

        // Locate the node targeted for removal
        Node<T> target = first;
        while (target != null
                && !element.equals(target.value)) {
            target = target.next;
        }

        if (target == null) {
            return false;
        }

        Node<T> pred = target.prev;        // Node before the target
        Node<T> succ = target.next;        // Node after the target

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

}
