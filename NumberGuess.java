import java.util.Random;
import java.util.Scanner;

public class NumberGuess{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Random random = new Random();

	        System.out.println("Welcome to the Number Guessing Game! \n Let's Check how lucky you are today.");
	        System.out.println("I have selected a random number. Try to guess it!");

	        int lB = 1; 
	        int uB = 100;
	        int sN = random.nextInt(uB - lB + 1) + lB;
	        int guess;
	        int attempts = 0;

	        do {
	            System.out.print("Enter your guess between " + lB+ " and " + uB + ": ");
	            guess = sc.nextInt();
	            attempts++;

	            if (guess < sN) {
	                System.out.println("Too low! Try again.");
	            } else if (guess > sN) {
	                System.out.println("Too high! Try again.");
	            } else {
	                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
	            }
	        } while (guess != sN);

	        sc.close();
        }
	}