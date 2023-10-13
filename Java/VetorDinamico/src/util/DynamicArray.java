package util;

import java.util.Arrays;

public class DynamicArray {

    private int[] array;
    private int lastPos;

    public DynamicArray() {
        array = new int[0];
        lastPos = 0;
    }
    // aux = [1, 2, 3]
    // array = [ , , , ]

    public void append(int value) {
        int capacity = array.length;

        if(lastPos == capacity-1) { // hora de aumentar
            int[] aux = array;
            array = new int[2*capacity];

            for (int i = 0; i < aux.length; i++) {
                array[i] = aux[i];
            }

            capacity = array.length;
        }

        array[lastPos] = value;
        lastPos++;
    }

    @Override
    public String toString() {
        String aux = "[";

        boolean first = true;
        for (int i = 0; i < array.length; i++) {
            if(first) {
                aux += array[i];
                first = false;
            } else {
                aux += ", " + array[i];
            }
        }

        aux += "]";
        return aux;
    }
}
