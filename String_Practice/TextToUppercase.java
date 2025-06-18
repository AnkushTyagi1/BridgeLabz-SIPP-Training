import java.util.Scanner;
public class TextToUppercase {
    public static String convertToUpperCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char)(ch - 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String builtInUpper = input.toUpperCase();
        String manualUpper = convertToUpperCase(input);
        boolean isEqual = compareStrings(builtInUpper, manualUpper);
        System.out.println("Converted Text: " + manualUpper);
        System.out.println("Comparison Result: " + isEqual);
    }
}
