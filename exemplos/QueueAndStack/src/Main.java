import util.Queue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<String> names = new Queue<>();
        Queue<Integer> ages = new Queue<>();

        ages.enqueue(20);
        ages.enqueue(20);
        ages.enqueue(21);
        ages.enqueue(23);
        ages.enqueue(25);

        names.dequeue();

        names.enqueue("Joao");

        names.dequeue();

        names.enqueue("Maria");
        names.enqueue("Pedro");
        names.enqueue("Lucas");

        names.dequeue();

        names.enqueue("Lais");

        System.out.println(names);

        System.out.println("Size: " + names.size());
    }
}
