import java.util.*;

public class NumberChecker {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }

    public static boolean isSpy(int n) {
        int sum = 0, product = 1;
        while (n > 0) {
            int d = n % 10;
            sum += d;
            product *= d;
            n /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int n) {
        int square = n * n;
        String numStr = String.valueOf(n);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Prime: " + isPrime(number));
        System.out.println("Neon: " + isNeon(number));
        System.out.println("Spy: " + isSpy(number));
        System.out.println("Automorphic: " + isAutomorphic(number));
        System.out.println("Buzz: " + isBuzz(number));
    }
}
