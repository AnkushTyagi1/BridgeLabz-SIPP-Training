import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    public static void generateException(String[] names, int index) {
        System.out.println("Accessing array without handling...");
        System.out.println("Name at index " + index + ": " + names[index]);
    }

    public static void handleException(String[] names, int index) {
        System.out.println("Accessing array with handling...");
        try {
            System.out.println("Name at index " + index + ": " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Invalid index.");
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        System.out.println("Enter 3 names:");
        for (int i = 0; i < 3; i++) {
            names[i] = sc.next();
        }
        System.out.print("Enter index to access: ");
        int index = sc.nextInt();
        handleException(names, index);
    }
}
