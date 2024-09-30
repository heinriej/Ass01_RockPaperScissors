import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String player1 = ""; // R P or S
        String player2 = ""; // R P or S
        String playAgain = "";
        boolean donePlaying = false;
        boolean play1Done = false;
        boolean play2Done = false;

        do {
            do {
                System.out.print("Enter move Player 1: ");
                player1 = in.nextLine();
                if (player1.equalsIgnoreCase("R") | player1.equalsIgnoreCase("P") | player1.equalsIgnoreCase("S")) {
                    play1Done = true;
                } else {
                    System.out.println("Invalid input. You must enter [R/P/S].");
                }

            } while (!play1Done);

            do {
                System.out.print("Enter move Player 2: ");
                player2 = in.nextLine();
                if (player2.equalsIgnoreCase("R") | player2.equalsIgnoreCase("P") | player2.equalsIgnoreCase("S")) {
                    play2Done = true;
                } else {
                    System.out.println("Invalid input. You must enter [R/P/S].");
                }
            } while (!play2Done);

            if (player1.equalsIgnoreCase("R")) {
                if (player2.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock: It's a TIE!");
                } else if (player2.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock: Player 2 wins!");
                } else {// Player 2 is Scissors
                    System.out.println("Rock smashes Scissors: Player 1 wins!");
                }
            } else if (player1.equalsIgnoreCase("P")) {
                if (player2.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock: Player 1 wins!");
                } else if (player2.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs Paper: It's a TIE!");
                } else // Player 2 is Scissors
                {
                    System.out.println("Scissors cuts Paper: Player 2 wins!");
                }
            } else {
                if (player2.equalsIgnoreCase("R")) {
                    System.out.println("Rock smashes Scissors: Player 2 wins!");
                } else if (player2.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts Paper: Player 1 wins!");
                } else // Player 2 is Scissors
                {
                    System.out.println("Scissors vs Scissors: It's a TIE!");
                }
            }

            System.out.println("Play again? [Y/N]: ");
            playAgain = in.nextLine();

            if (playAgain.equalsIgnoreCase("N")) {
                donePlaying = true;
            }
        }while(!donePlaying);
    }
}