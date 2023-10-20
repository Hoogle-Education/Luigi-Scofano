import static java.lang.Math.max;

public class Main {

    // maior soma de subsequencia nao continua

    // exemplo: 10 5 -5 70 100 50
    // atualmente 2^n
    // maior soma = 10 + 70 + 50

    // dp -> maior soma ate agora
    // i -> quantidade de elementos escolhidos
    // dp[0] = 0
    // dp[1] = 10 (seq[0])
    // dp[2] = maximo(dp[1] , dp[0] + 5)
    // dp[i] = max(dp[i-1], dp[i-2] + seq[i])

    public static int longestSumInNonContinuousSubsequence(int... sequence) {
        int n = sequence.length;
        int[] dp = new int[n+1];

        // base
        dp[0] = Integer.MIN_VALUE;
        dp[1] = sequence[0];

        // dinamico
        for (int i = 2; i < n+1; i++) {
            dp[i] = max(dp[i-2] + sequence[i-1], dp[i-1]);
        }

        return dp[n];
    }

    public static int longestContinuousSubsequenceSum(int... sequence) {
        int n = sequence.length;
        int[] dp = new int[n+1];

        // base
        dp[0] = 0;

        for (int i = 1; i < n+1; i++) {
            dp[i] = dp[i-1] + sequence[i-1];
            if(dp[i] < 0) dp[i] = 0;
        }

        int best = dp[0];

        for (int i = 0; i < n+1; i++)
            if(dp[i] > best) best = dp[i];

        return best;
    }

    public static void main(String[] args) {
        // longestSumInNonContinuousSubsequence(10, 5, -5, 70, 100, 50);

        System.out.println(longestContinuousSubsequenceSum(10, -15, 20, 70, -30, 50, -70, 10));
    }
}