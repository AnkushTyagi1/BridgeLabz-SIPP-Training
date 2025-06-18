import java.util.Scanner;

public class WordLengthAnalysis {
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

    public static int[] findShortestAndLongest(String[][] wordLengths) {
        int minLen = Integer.MAX_VALUE, maxLen = Integer.MIN_VALUE;
        int minIdx = -1, maxIdx = -1;
        for (int i = 0; i < wordLengths.length; i++) {
            int len = Integer.parseInt(wordLengths[i][1]);
            if (len < minLen) {
                minLen = len;
                minIdx = i;
            }
            if (len > maxLen) {
                maxLen = len;
                maxIdx = i;
            }
        }
        return new int[]{minIdx, maxIdx};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String input = sc.nextLine();
        String[] words = splitWords(input);
        String[][] wordLengths = getWordsAndLengths(words);
        int[] result = findShortestAndLongest(wordLengths);

        System.out.println("Words and their lengths:");
        for (int i = 0; i < wordLengths.length; i++) {
            System.out.println(wordLengths[i][0] + " -> " + wordLengths[i][1]);
        }

        System.out.println("\nShortest word: " + wordLengths[result[0]][0]);
        System.out.println("Longest word: " + wordLengths[result[1]][0]);
    }
}
