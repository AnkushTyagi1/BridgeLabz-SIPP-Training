import java.util.Scanner;
public class NumberFormatExceptionDemo {
    public static void generateException(String text) {
        System.out.println("Trying to convert input to number (without handling)...");
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }
    public static void handleException(String text) {
        System.out.println("Trying to convert input to number (with handling)...");
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: Input is not a valid number.");
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to convert to number: ");
        String input = sc.nextLine();
        handleException(input);
    }
}
