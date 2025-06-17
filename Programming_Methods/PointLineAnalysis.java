import java.util.*;

public class PointLineAnalysis {
    public static double getEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] getLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();
        double x2 = sc.nextDouble(), y2 = sc.nextDouble();
        double d = getEuclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f\n", d);
        if (x1 == x2) {
            System.out.println("Vertical Line: x = " + x1);
        } else {
            double[] eq = getLineEquation(x1, y1, x2, y2);
            System.out.printf("Line Equation: y = %.2fx + %.2f\n", eq[0], eq[1]);
        }
    }
}
