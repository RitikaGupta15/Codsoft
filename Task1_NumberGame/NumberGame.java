package Task1_NumberGame;

import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;
        String playAgain = "yes";

        while (playAgain.equals("yes")) {
            int number = rand.nextInt(100) + 1;
            int tries = 0;
            int maxTries = 10;
            boolean guessed = false;

            System.out.println("Guess the number between 1 and 100. You have " + maxTries + " tries.");

            while (tries < maxTries) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                tries++;

                if (guess == number) {
                    System.out.println("Correct! You guessed it in " + tries + " tries.");
                    score += (maxTries - tries + 1);
                    guessed = true;
                    break;
                } else if (guess < number) {
                    System.out.println("Too low.");
                } else {
                    System.out.println("Too high.");
                }
            }

            if (!guessed) {
                System.out.println("You ran out of tries. The number was: " + number);
            }
 
            System.out.print("Play again? (yes/no): ");
            playAgain = sc.next().toLowerCase();
        }

        System.out.println("Game over. Your score: " + score);
        sc.close();
    }
}
