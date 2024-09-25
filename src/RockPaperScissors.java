import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] choices = {"rock", "paper", "scissors"};

        System.out.println("Let's play Rock-Paper-Scissors!");
        System.out.println("Enter your choice (rock, paper, or scissors):");

        while (true) {
            String userChoice = scanner.nextLine().toLowerCase();
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice! Please enter rock, paper, or scissors.");
                continue;
            }

            // Generate computer's choice
            int randomIndex = (int) (Math.random() * 3);
            String computerChoice = choices[randomIndex];

            System.out.println("Computer chose: " + computerChoice);

            // Determine winner
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("yes")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }
    }
}
