import util.DynamicArray;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();

        // 0 + 1 + 2 + 3 + .. + n-1 = (n-1)n/2
        Integer a = 2;



        array.append(2);
        array.append(3);
        array.append(4);
        array.append(5);

        System.out.println(array);

        List<Integer> inteiros = new ArrayList<Integer>();
        inteiros.add(2);
    }
}