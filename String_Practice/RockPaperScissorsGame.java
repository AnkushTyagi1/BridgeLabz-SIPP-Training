import java.util.Scanner;

public class RockPaperScissorsGame {
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "rock";
        if (choice == 1) return "paper";
        return "scissors";
    }

    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
                (user.equals("paper") && computer.equals("rock")) ||
                (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        }
        return "Computer";
    }

    public static String[][] calculateStats(String[][] results, int totalGames) {
        int userWins = 0, computerWins = 0, draws = 0;
        for (int i = 0; i < totalGames; i++) {
            String winner = results[i][2];
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
            else draws++;
        }

        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", (userWins * 100.0) / totalGames) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", (computerWins * 100.0) / totalGames) + "%";

        return stats;
    }

    public static void displayResults(String[][] results, String[][] stats, int totalGames) {
        System.out.println("\nGame\tUser\tComputer\tWinner");
        for (int i = 0; i < totalGames; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2]);
        }

        System.out.println("\nStats:");
        System.out.println("Player\tWins\tWin %");
        for (int i = 0; i < 2; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games to play: ");
        int totalGames = sc.nextInt();

        String[][] results = new String[totalGames][3];

        for (int i = 0; i < totalGames; i++) {
            System.out.print("\nGame " + (i + 1) + " - Enter your choice (rock/paper/scissors): ");
            String userChoice = sc.next().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = getWinner(userChoice, computerChoice);

            results[i][0] = userChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;
        }

        String[][] stats = calculateStats(results, totalGames);
        displayResults(results, stats, totalGames);
    }
}
