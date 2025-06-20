import java.util.*;

public class CollinearityChecker {

    public static boolean isCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    public static boolean isCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        int x3 = sc.nextInt(), y3 = sc.nextInt();

        if (isCollinearBySlope(x1, y1, x2, y2, x3, y3))
            System.out.println("Collinear (Slope Method)");
        else
            System.out.println("Not Collinear (Slope Method)");

        if (isCollinearByArea(x1, y1, x2, y2, x3, y3))
            System.out.println("Collinear (Area Method)");
        else
            System.out.println("Not Collinear (Area Method)");
    }
}
