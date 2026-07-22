package com.projects1;

import java.util.Random;
import java.util.Scanner;

public class GuessTheRandomNumber {

	public static void main(String[] args) {
		System.out.println("weclome to the random number guessing game zone");
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		String playAgain;
		do {
			int randomNumber = r.nextInt(10);
			int attempts = 0;
			int guess;

			while (attempts < 3) {
				System.out.println("Enter the Guessing Number:");
				guess = sc.nextInt();

				attempts++;
				// Hints to guess the random number
				if (guess > randomNumber) {
					System.out.println("Too high! Try again.");
				} else if (guess < randomNumber) {
					System.out.println("Too low! Try again.");
				} else {
					System.out.println("🎉 You won the game!!!");

					if (attempts == 1) {
						System.out.println("* * * Excellent");
					}
					if (attempts == 2) {
						System.out.println("* * Good");
					} else {
						System.out.println("* You got it!");
					}
					return;
				}
			}
			System.out.println("❌ Game Over! The correct number was: " + randomNumber);
			System.out.println("Do you want to play again? (yes/no)");
			playAgain = sc.next();

		} while (playAgain.equalsIgnoreCase("yes"));

		System.out.println("Thanks for playing! 👋");
		sc.close();

	}

}
