import java.util.*;

public class MatrixOperations {

    public static double[][] generateRandomMatrix(int rows, int cols, int min, int max) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(max - min + 1) + min;
        return matrix;
    }

    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        double[][] transposed = new double[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transposed[j][i] = matrix[i][j];
        return transposed;
    }

    public static double determinant2x2(double[][] m) {
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }

    public static double determinant3x3(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1]) -
                m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0]) +
                m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;
        return inv;
    }

    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) return null;
        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]);
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]);
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]);
        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]);
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]);
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]);
        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]);
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]);
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]);

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                inv[i][j] /= det;

        return inv;
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row)
                System.out.printf("%8.2f", val);
            System.out.println();
        }
    }

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size (2 or 3): ");
        int size = sc.nextInt();

        if (size != 2 && size != 3) {
            System.out.println("Only 2x2 or 3x3 supported.");
            return;
        }

        double[][] matrix = generateRandomMatrix(size, size, 1, 9);
        System.out.println("\nOriginal Matrix:");
        displayMatrix(matrix);

        double[][] transposed = transposeMatrix(matrix);
        System.out.println("\nTranspose:");
        displayMatrix(transposed);

        if (size == 2) {
            double det = determinant2x2(matrix);
            System.out.println("\nDeterminant: " + det);
            double[][] inv = inverse2x2(matrix);
            if (inv != null) {
                System.out.println("\nInverse:");
                displayMatrix(inv);
            } else System.out.println("\nInverse doesn't exist (det = 0)");
        } else {
            double det = determinant3x3(matrix);
            System.out.println("\nDeterminant: " + det);
            double[][] inv = inverse3x3(matrix);
            if (inv != null) {
                System.out.println("\nInverse:");
                displayMatrix(inv);
            } else System.out.println("\nInverse doesn't exist (det = 0)");
        }
    }
}
