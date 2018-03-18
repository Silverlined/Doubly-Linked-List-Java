package LinkedList;

public class LinkedList1<T> {
    private LinkedListNode1 head;
    private LinkedListNode1 tail;
    private int count;

    public LinkedList1() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    public void add(T value) {
        LinkedListNode1<T> tempNode = new LinkedListNode1<>(value);
        LinkedListNode1 currentNode = head;
        if (head == null) {
            currentNode = tempNode;
            head = currentNode;
        } else {
            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(tempNode);
            tempNode.setPrevNode(currentNode);
            tail = tempNode;
        }
        count++;
    }

    public LinkedListNode1 get(int index) {
        if (index < 0 || index > count) {
            throw new IllegalArgumentException();
        } else if (index < count / 2) {
            LinkedListNode1 tempNode = head;
            int counter = 0;
            while (tempNode.getNextNode() != null) {
                if (index == counter) {
                    return tempNode;
                }
                tempNode = tempNode.getNextNode();
                counter++;
            }
        } else {
            LinkedListNode1 tempNode = tail;
            int counter = count - 1;
            while (tempNode.getPrevNode() != null) {
                if (index == counter) {
                    return tempNode;
                }
                tempNode = tempNode.getPrevNode();
                counter--;
            }
        }
        return null;
    }

    public int getCount() {
        return count;
    }

    public LinkedListNode1 getHead() {
        return head;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setHead(LinkedListNode1<T> head) {
        this.head = head;
    }
}
