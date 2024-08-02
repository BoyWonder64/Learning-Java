import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rng = new Random();

        int computerGuess = rng.nextInt(4);

        System.out.println("Welcome to Guess Number\n");

        System.out.println("Guess a number between 0 and 3");

        System.out.print("Enter your guess: ");
        int userGuess = input.nextInt();

        while (userGuess != computerGuess){
            System.out.println("Try again: ");
             userGuess = input.nextInt();

        }

        System.out.println("Correct!\n You did it!");


    }
}