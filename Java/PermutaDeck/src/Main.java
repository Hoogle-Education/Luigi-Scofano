public class Main {
    public static void main(String[] args) {
        Math.random();
        // [i, i + 1)
    }
}

// A, B, C

// [i = 0]
// A B C | B A C | B C A

// [i = 1]
// (BAC, ABC, ACB) | (ABC, BAC, BCA) | (ABC, BAC, BCA)

// [i = 2]
// [BAC, ABC, ACB] | (ABC, BAC, BCA) | (ABC, BAC, BCA)