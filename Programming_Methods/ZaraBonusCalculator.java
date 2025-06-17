public class ZaraBonusCalculator {
    public static double[][] generateEmployeeData(int n) {
        double[][] data = new double[n][2];
        for (int i = 0; i < n; i++) {
            data[i][0] = 10000 + (int) (Math.random() * 90000); // 5-digit salary
            data[i][1] = 1 + (int) (Math.random() * 10); // 1 to 10 years of service
        }
        return data;
    }

    public static double[][] calculateNewSalaries(double[][] employeeData) {
        int n = employeeData.length;
        double[][] newData = new double[n][2];
        for (int i = 0; i < n; i++) {
            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonusPercent = years > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusPercent;
            newData[i][0] = salary + bonus;
            newData[i][1] = bonus;
        }
        return newData;
    }

    public static void displayResults(double[][] employeeData, double[][] newData) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.println("Emp\tOldSalary\tYears\tBonus\t\tNewSalary");
        for (int i = 0; i < employeeData.length; i++) {
            double oldSal = employeeData[i][0];
            double yrs = employeeData[i][1];
            double bonus = newData[i][1];
            double newSal = newData[i][0];
            totalOld += oldSal;
            totalBonus += bonus;
            totalNew += newSal;
            System.out.println((i + 1) + "\t" + (int) oldSal + "\t\t" + (int) yrs + "\t" + String.format("%.2f", bonus) + "\t" + String.format("%.2f", newSal));
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("Total\t" + (int) totalOld + "\t\t\t" + String.format("%.2f", totalBonus) + "\t" + String.format("%.2f", totalNew));
    }

    public static void main(String... args) {
        int n = 10;
        double[][] employeeData = generateEmployeeData(n);
        double[][] newData = calculateNewSalaries(employeeData);
        displayResults(employeeData, newData);
    }
}
