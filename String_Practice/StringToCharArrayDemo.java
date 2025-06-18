import java.util.Scanner;

public class StringToCharArrayDemo {
    public static char[] getCharsFromString(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        char[] manualArray = getCharsFromString(input);
        char[] builtInArray = input.toCharArray();
        boolean isEqual = compareCharArrays(manualArray, builtInArray);

        System.out.print("Manual Array: ");
        for (char c : manualArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.print("Built-in Array: ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Comparison Result: " + isEqual);
    }
}
