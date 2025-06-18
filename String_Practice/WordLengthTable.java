import java.util.Scanner;

public class WordLengthTable {
    public static String[] splitWords(String text) {
        String[] words = new String[100];
        int wordCount = 0;
        String word = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else if (!word.equals("")) {
                words[wordCount++] = word;
                word = "";
            }
        }
        if (!word.equals("")) {
            words[wordCount++] = word;
        }
        String[] result = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            result[i] = words[i];
        }
        return result;
    }

    public static int getLength(String word) {
        int count = 0;
        try {
            while (true) {
                word.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[][] getWordsAndLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String[][] wordLengthTable = getWordsAndLengths(words);
        System.out.println("Word\tLength");
        for (int i = 0; i < wordLengthTable.length; i++) {
            System.out.println(wordLengthTable[i][0] + "\t" + Integer.parseInt(wordLengthTable[i][1]));
        }
    }
}
