import java.util.Scanner;

public class ChocolateDivider {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfChocolates = scanner.nextInt();
        int numberOfChildren = scanner.nextInt();

        if (numberOfChildren <= 0) {
            System.out.println("Number of children must be greater than 0.");
            return;
        }
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        System.out.println("Each child will get " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);
    }
}
