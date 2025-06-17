import java.util.Scanner;
public class BMICalculator {
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;
            data[i][2] = weight / (heightM * heightM);
        }
    }
    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) status[i] = "Underweight";
            else if (bmi < 25) status[i] = "Normal weight";
            else if (bmi < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        return status;
    }
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }
        calculateBMI(data);
        String[] status = getBMIStatus(data);
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d -> Weight: %.1f kg, Height: %.1f cm, BMI: %.2f, Status: %s%n", i + 1, data[i][0], data[i][1], data[i][2], status[i]);
        }
    }
}
