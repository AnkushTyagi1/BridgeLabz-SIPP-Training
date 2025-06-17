import java.util.Random;

public class FootballTeamHeights {
    public static int[] generateRandomHeights(int size) {
        Random r = new Random();
        int[] h = new int[size];
        for (int i = 0; i < size; i++) h[i] = r.nextInt(101) + 150;
        return h;
    }

    public static int findSum(int[] h) {
        int s = 0;
        for (int x : h) s += x;
        return s;
    }

    public static double findMean(int[] h) {
        return (double) findSum(h) / h.length;
    }

    public static int findShortest(int[] h) {
        int m = Integer.MAX_VALUE;
        for (int x : h) if (x < m) m = x;
        return m;
    }

    public static int findTallest(int[] h) {
        int m = Integer.MIN_VALUE;
        for (int x : h) if (x > m) m = x;
        return m;
    }

    public static void main(String[] args) {
        int[] h = generateRandomHeights(11);
        for (int x : h) System.out.print(x + " ");
        System.out.println();
        System.out.println("Shortest:" + findShortest(h) + "cm");
        System.out.println("Tallest:" + findTallest(h) + "cm");
        System.out.printf("Mean:%.2fcm%n", findMean(h));
    }
}
