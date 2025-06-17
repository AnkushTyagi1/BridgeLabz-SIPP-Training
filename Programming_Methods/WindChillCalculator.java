import java.util.Scanner;
public class WindChillCalculator {
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
    }
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        double temperature = scanner.nextDouble();
        double windSpeed = scanner.nextDouble();
        if (windSpeed < 3 || temperature > 50) {
            System.out.println("Wind chill is not defined for wind speed < 3 mph or temperature > 50°F.");
            return;
        }
        double result = calculateWindChill(temperature, windSpeed);
        System.out.println("Wind Chill Temperature: " + result);
    }
}
