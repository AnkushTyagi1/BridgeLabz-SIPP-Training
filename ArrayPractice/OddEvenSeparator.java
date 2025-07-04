import java.util.Scanner;

public class OddEvenSeparator {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
            return;
        }

        int size = number / 2 + 1;
        int[] odd = new int[size];
        int[] even = new int[size];
        int oddIndex = 0, evenIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex++] = i;
            } else {
                odd[oddIndex++] = i;
            }
        }

        System.out.println("Odd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        System.out.println("\nEven numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }

        sc.close();
    }
}
