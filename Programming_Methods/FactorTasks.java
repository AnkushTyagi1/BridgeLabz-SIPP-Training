import java.util.*;

public class FactorTasks {
    public static int[] findFactors(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) c++;
        int[] f = new int[c];
        int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) f[idx++] = i;
        return f;
    }

    public static int greatestFactor(int[] f) {
        int g = f[0];
        for (int x : f) if (x > g) g = x;
        return g;
    }

    public static int sumOfFactors(int[] f) {
        int s = 0;
        for (int x : f) s += x;
        return s;
    }

    public static int productOfFactors(int[] f) {
        int p = 1;
        for (int x : f) p *= x;
        return p;
    }

    public static double cubeProductOfFactors(int[] f) {
        double p = 1;
        for (int x : f) p *= Math.pow(x, 3);
        return p;
    }

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] f = findFactors(n);
        System.out.println("Factors:" + Arrays.toString(f));
        System.out.println("Greatest:" + greatestFactor(f));
        System.out.println("Sum:" + sumOfFactors(f));
        System.out.println("Product:" + productOfFactors(f));
        System.out.printf("CubeProduct:%.0f\n", cubeProductOfFactors(f));
    }
}
