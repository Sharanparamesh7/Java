import java.util.Scanner;

public class r {
    public static void main(String[] args) {
        String[] options = { "rock", "paper", "scissors" };
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's play rock-paper-scissors! Choose your move (rock, paper, or scissors):");
        String userMove = scanner.nextLine().toLowerCase();
        while (!isValidMove(userMove)) {
            System.out.println("Invalid move. Choose again (rock, paper, or scissors):");
            userMove = scanner.nextLine().toLowerCase();
        }

        String computerMove = options[(int) (Math.random() * 3)];
        System.out.println("The computer chose " + computerMove + ".");

        if (userMove.equals(computerMove)) {
            System.out.println("It's a tie!");
        } else if ((userMove.equals("rock") && computerMove.equals("scissors")) ||
                   (userMove.equals("paper") && computerMove.equals("rock")) ||
                   (userMove.equals("scissors") && computerMove.equals("paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("The computer wins!");
        }

        scanner.close();
    }

    public static boolean isValidMove(String move) {
        return move.equals("rock") || move.equals("paper") || move.equals("scissors");
    }
}
