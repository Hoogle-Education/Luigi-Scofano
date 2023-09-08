import java.util.Arrays;

public class App {
    // top down - cima pra baixo
    // botton up - baixo pra cima

    // soma(n) = n + soma(n-1)

    // soma(3) = 3 + soma(2)
    // soma(2) = 2 + soma(1)
    // soma(1) = 1 + soma(0)
    
    // supoe n = n(n+1)/2
    // n+1: (n+1)(n+2)/2 = (n+1)n/2 + (n+1)

    public static int somaRecursiva(int n) {
        // caso base
        if(n == 1)
            return 1;

        // caso recursivo
        return n + somaRecursiva(n-1);
    }

    public static int somaIterativa(int n) {
        int soma = 0;

        for(int i=0; i <= n; i++) {
            soma += i;
        }

        return soma;
    }

    // -----------
    // fibonacci
    // 0 1 1 2 3 5 8 13
    public static int[] dp = new int[10000];

    public static int fibRecursivo(int n) {
        // caso dinamico - caso memorizado
        if(dp[n] != -1) { 
            return dp[n];
        }

        // caso base
        if(n==0) return dp[0] = 0;
        if(n==1) return dp[1] = 1;

        // caso recursivo
        return dp[n] = fibRecursivo(n-1) + fibRecursivo(n-2);
    }
    
    public static int fibIterativo(int n) {
        int[] fib = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;

        for(int i=2; i<=n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }

        return fib[n];
    }

    public static void main(String[] args) throws Exception {
        Arrays.fill(dp, -1);

        int n = 10;
        System.out.println(somaRecursiva(100));
        System.out.println(somaIterativa(100));

        System.out.println(fibRecursivo(5));
        System.out.println(fibIterativo(5));
    }
}
