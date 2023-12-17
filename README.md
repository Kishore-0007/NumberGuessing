# Number Guessing Game

This is a simple number guessing game implemented in Java. The game generates a random number and the player has to guess it.

## How to Play

1. Run the program.
2. The program will generate a random number between 1 and 100.
3. You will be prompted to enter your guess.
4. If your guess is too low, the program will tell you "Too low! Try again."
5. If your guess is too high, the program will tell you "Too high! Try again."
6. Keep guessing until you guess the correct number.
7. Once you guess the correct number, the program will congratulate you and tell you how many attempts it took you to guess the number.

## Code Structure

The code uses the `java.util.Random` and `java.util.Scanner` classes. The `Random` class is used to generate the random number and the `Scanner` class is used to read the player's guesses from the console.

The main logic of the game is inside a `do-while` loop. This loop continues until the player guesses the correct number.

## Running the Program

To run the program, you need to have Java installed on your machine. You can run the program using the following command:

java NumberGuess.java
