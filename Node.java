package clinkedclass;

/**
 *
 * The Node class will store a list element and a reference to the next node.
 *
 * @author olga.osinskaya
 */
public class Node <T>{

    T value;
    Node <T>next, prev;

    Node() {
        next = null;
        prev = null;
        value = null;
    }

    /**
     * Constructor.
     *
     * @param val The element to store in the node.
     * @param n The reference to the successor node.
     * @param p The reference to the previous node
     */
    Node(T val, Node<T> n, Node<T> p) {
        value = val;
        next = n;
        prev = p;
    }

    /**
     * Constructor.
     *
     * @param val The element to be stored in the node.
     */
    Node(T val) {
        // Just call the other (sister) constructor
        this(val, null, null);
    }

    T getData() {
        return value;
    }

    public void setNextNode(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrevNode() {
        return prev;
    }

    public void setPrevNode(Node<T> prev) {
        this.prev = prev;
    }

    public void setData(T data) {
        this.value = data;
    }

    public Node<T> getNextNode() {
        return next;
    }
}
