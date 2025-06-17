import java.util.Scanner;
public class NumberAnalysis {
    public static boolean isPositive(int num) {
        return num >= 0;
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a < b) return -1;
        return 0;
    }
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (isPositive(arr[i])) {
                if (isEven(arr[i])) {
                    System.out.println(arr[i] + " is positive and even");
                } else {
                    System.out.println(arr[i] + " is positive and odd");
                }
            } else {
                System.out.println(arr[i] + " is negative");
            }
        }
        int result = compare(arr[0], arr[4]);
        if (result == 0) {
            System.out.println("First and last elements are equal");
        } else if (result == 1) {
            System.out.println("First element is greater than last element");
        } else {
            System.out.println("First element is less than last element");
        }
    }
}
