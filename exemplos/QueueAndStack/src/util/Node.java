package util;

public class Node<T> {
    public T value;
    public Node<T> next;

    public Node(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value='" + value + '\'' +
                '}';
    }
}

