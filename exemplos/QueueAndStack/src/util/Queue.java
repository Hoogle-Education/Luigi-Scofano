package util;

public class Queue<T> {

    private Node<T> start;
    private Node<T> end;

    public boolean isEmpty() {
        return start == null;
    }

    public int size() {
        int count = 1;
        Node<T> current = start;

        while(current.next != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public void enqueue(T data) {
        if(isEmpty()) {
            start = new Node<>(data);
            end = start;
            return;
        }

       end.next = new Node<>(data);
       end = end.next;
    }

    public void dequeue() {
        if(isEmpty()) return;

        start = start.next;

        if(isEmpty()) end = null;
    }

    @Override
    public String toString() {
        String aux = "";

        Node<T> current = start;

        while(current != null) {
            aux += current.value + " ";
            current = current.next;
        }

        return aux;
    }
}

