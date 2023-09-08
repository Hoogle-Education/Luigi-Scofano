public class App {

    public static void hanoi3(int n, String orig, String dest, String aux) {
        if (n == 1) {
            System.out.println("Mova o disco da origem: " + orig + " para + " + dest);
            return;
        }

        
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

// (n-1)2^n + 1
// n*2^n - 2^n + 1
// n*2^n - (2^n - 1)
// n*2^n - (T_n)

