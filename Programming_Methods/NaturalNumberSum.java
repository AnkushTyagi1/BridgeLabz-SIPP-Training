import java.util.Scanner;
public class NaturalNumberSum {
    public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a natural number (n > 0)");
            return;
        }
        int sumRecursive = recursiveSum(n);
        int sumFormula = formulaSum(n);
        System.out.println("Recursive Sum: " + sumRecursive);
        System.out.println("Formula Sum: " + sumFormula);
        if (sumRecursive == sumFormula) System.out.println("Both results match.");
        else System.out.println("Mismatch in results.");
    }
}
