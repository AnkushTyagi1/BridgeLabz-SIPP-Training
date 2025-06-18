import java.util.Scanner;

public class TrimSpaces {
    public static int[] getTrimIndices(String text) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                start = i;
                break;
            }
        }
        for (int i = text.length() - 1; i >= 0; i--) {
            if (text.charAt(i) != ' ') {
                end = i;
                break;
            }
        }
        return new int[]{start, end};
    }

    public static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text with leading/trailing spaces: ");
        String text = sc.nextLine();
        int[] indices = getTrimIndices(text);
        String customTrimmed = customSubstring(text, indices[0], indices[1]);
        String builtInTrimmed = text.trim();
        boolean isSame = compareStrings(customTrimmed, builtInTrimmed);
        System.out.println("Custom Trimmed: \"" + customTrimmed + "\"");
        System.out.println("Built-in Trimmed: \"" + builtInTrimmed + "\"");
        System.out.println("Are both results same? " + isSame);
    }
}
