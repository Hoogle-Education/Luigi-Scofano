public class App {

    public static int count = 0;

    public static void hanoi3(int n, String orig, String dest, String aux) {
        if (n == 1) {
            System.out.println("Mova o disco 1 da origem: " + orig + " para " + dest);
            return;
        }

        hanoi3(n-1, orig, aux, dest);
        System.out.println("Mova o disco " + n + " da origem: " + orig + " para " + dest);
        hanoi3(n-1, aux, dest, orig);
    }

    public static void hanoi4(int n, String orig, String dest, String aux1, String aux2) {

        if(n == 0) return;

        if (n == 1) {
            count++;
            System.out.println("#" + count + " - Mova o disco " + n + " da origem: " + orig + " para " + dest);
            return;
        }

        hanoi4(n-2, orig, aux1, aux2, dest);

        count ++;
        System.out.println("#" + count + " - Mova o disco " + (n-1) + " da origem: " + orig + " para " + aux2);

        count ++;
        System.out.println("#" + count + " - Mova o disco " + n + " da origem: " + orig + " para " + dest);

        count ++;
        System.out.println("#" + count + " - Mova o disco " + (n-1) + " da origem: " + aux2 + " para " + dest);

        hanoi4(n-2, aux1, dest, orig, aux2);
    }

    public static void main(String[] args) throws Exception {
        hanoi4(4, "A", "B", "C", "D");
    }
}

// (n-1)2^n + 1
// n*2^n - 2^n + 1
// n*2^n - (2^n - 1)
// n*2^n - (T_n)

