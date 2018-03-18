package LinkedList;

public class LinkedListNode1<T> {
    private T value;
    private LinkedListNode1 nextNode;
    private LinkedListNode1 prevNode;

    public LinkedListNode1(T value, LinkedListNode1 nextNode, LinkedListNode1 prevNode) {
        this.value = value;
        this.nextNode = nextNode;
        this.prevNode = prevNode;
    }

    public LinkedListNode1(T value) {
        this.value = value;
        this.nextNode = null;
        this.prevNode = null;
    }

    public T getValue() {
        return value;
    }

    public LinkedListNode1 getNextNode() {
        return nextNode;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setNextNode(LinkedListNode1 nextNode) {
        this.nextNode = nextNode;
    }

    public LinkedListNode1 getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(LinkedListNode1 prevNode) {
        this.prevNode = prevNode;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
