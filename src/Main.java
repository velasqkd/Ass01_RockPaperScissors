import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playAgain;

        do {
            String playerAChoice = "";
            while (!playerAChoice.equals("R") && !playerAChoice.equals("P") && !playerAChoice.equals("S")) {
                System.out.print("Player A, enter your choice (R/P/S): ");
                playerAChoice = in.nextLine().toUpperCase();
                if (!playerAChoice.equals("R") && !playerAChoice.equals("P") && !playerAChoice.equals("S")) {
                    System.out.println("Invalid input. Please choose R, P, or S.");
                }
            }

            String playerBChoice = "";
            while (!playerBChoice.equals("R") && !playerBChoice.equals("P") && !playerBChoice.equals("S")) {
                System.out.print("Player B, enter your choice (R/P/S): ");
                playerBChoice = in.nextLine().toUpperCase();
                if (!playerBChoice.equals("R") && !playerBChoice.equals("P") && !playerBChoice.equals("S"))
                {
                    System.out.println("Invalid input. Please choose R, P, or S.");
                }
            }

            System.out.println("Player A chose " + playerAChoice);
            System.out.println("Player B chose " + playerBChoice);

            if (playerAChoice.equals(playerBChoice)) {
                System.out.println("It's a Tie!");
            } else if ((playerAChoice.equals("R") && playerBChoice.equals("S")) ||
                    (playerAChoice.equals("P") && playerBChoice.equals("R")) ||
                    (playerAChoice.equals("S") && playerBChoice.equals("P"))) {
                System.out.println("Player A wins!");
                if (playerAChoice.equals("R") && playerBChoice.equals("S")) {
                    System.out.println("Rock breaks Scissors!");
                } else if (playerAChoice.equals("P") && playerBChoice.equals("R")) {
                    System.out.println("Paper covers Rock!");
                } else {
                    System.out.println("Scissors cuts Paper!");
                }
            } else {
                System.out.println("Player B wins!");
                if (playerBChoice.equals("R") && playerAChoice.equals("S")) {
                    System.out.println("Rock breaks Scissors!");
                } else if (playerBChoice.equals("P") && playerAChoice.equals("R")) {
                    System.out.println("Paper covers Rock!");
                } else {
                    System.out.println("Scissors cuts Paper!");
                }
            }

            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = in.nextLine().toUpperCase();

        } while (playAgain.equals("Y"));

        System.out.println("Thank you for playing!");
    }
