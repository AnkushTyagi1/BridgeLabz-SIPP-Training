import java.util.Scanner;

public class StudentScoreCard {
    public static int[][] generateMarks(int students) {
        int[][] marks = new int[students][3];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = (int)(Math.random() * 41 + 60); // Random 2-digit marks (60–100)
            }
        }
        return marks;
    }

    public static double[][] calculateStats(int[][] marks) {
        int students = marks.length;
        double[][] stats = new double[students][3];
        for (int i = 0; i < students; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = total / 3.0;
            stats[i][0] = total;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return stats;
    }

    public static String[] calculateGrades(double[][] stats) {
        int students = stats.length;
        String[] grades = new String[students];
        for (int i = 0; i < students; i++) {
            double percentage = stats[i][2];
            if (percentage >= 90) grades[i] = "A+";
            else if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B";
            else if (percentage >= 60) grades[i] = "C";
            else if (percentage >= 50) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }

    public static void displayScoreCard(int[][] marks, double[][] stats, String[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < marks.length; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(marks[i][0] + "\t" + marks[i][1] + "\t\t" + marks[i][2] + "\t");
            System.out.print((int)stats[i][0] + "\t");
            System.out.print(stats[i][1] + "\t");
            System.out.print(stats[i][2] + "\t\t");
            System.out.println(grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = generateMarks(n);
        double[][] stats = calculateStats(marks);
        String[] grades = calculateGrades(stats);
        displayScoreCard(marks, stats, grades);
    }
}
