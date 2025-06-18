import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    public static void generateException(String text, int start, int end) {
        System.out.println("Generating IllegalArgumentException without handling...");
        String result = text.substring(start, end);
        System.out.println("Substring: " + result);
    }

    public static void handleException(String text, int start, int end) {
        System.out.println("Handling IllegalArgumentException with try-catch...");
        try {
            String result = text.substring(start, end);
            System.out.println("Substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: Start index is greater than end index.");
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        handleException(text, start, end);
    }
}
