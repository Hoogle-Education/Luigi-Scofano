package util;

public class LinkedList {

    private Node first;
    private Node last;

    public LinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }
    // [1] -> [2] -> [3] -> [4] -> null
    //  f                    l

    public void append(int value) {
        if(isEmpty()){
            first = new Node(value);
            last = first;
            return;
        }

        last.next = new Node(value);
        last = last.next;
    }
}
