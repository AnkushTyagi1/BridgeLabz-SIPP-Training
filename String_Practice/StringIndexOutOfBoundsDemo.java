import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void generateException(String text, int index) {
        System.out.println("Accessing character without handling...");
        System.out.println("Character at index " + index + ": " + text.charAt(index));
    }

    public static void handleException(String text, int index) {
        System.out.println("Accessing character with handling...");
        try {
            System.out.println("Character at index " + index + ": " + text.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: Invalid index.");
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.print("Enter index to access: ");
        int index = sc.nextInt();
        // generateException(input, index);
        handleException(input, index);
    }
}
