package numberguessinggame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		int maxRange,maxAttempt;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please select the difficulty level:");
		System.out.println("1. Easy");
		System.out.println("2. Medium");
		System.out.println("3. Hard");
		int choice=sc.nextInt();
		switch(choice) {
			case 1: 
				maxRange=50;
				maxAttempt=10;
				break;
			case 2:
				maxRange=100;
				maxAttempt=7;
				break;
			case 3:
				maxRange=500;
				maxAttempt=5;
				break;
			default :
				System.out.println("Invalid choice! setting to medium");
				maxRange=100;
				maxAttempt=7;
			}
			
		Random random=new Random();
		int number=random.nextInt(maxRange)+1;
		int attempts=0;
		boolean guessedCorrectly=false;
		System.out.println("Now game runs between 1 - "+maxRange + " with only "+maxAttempt+" guesses.");
		
		while(attempts<maxAttempt&&!guessedCorrectly) {
			System.out.println("Please guess the number:");
			int guess=sc.nextInt();
			attempts++;
			System.out.println("Attempts left: " + (maxAttempt - attempts));
			if(guess>=1&&guess<=maxRange) {
				if(guess>number) {
					System.out.println("Too High😕");
				} else if(guess<number) {
					System.out.println("Too Low😕");
				}else{
					System.out.println("Congratulations!! You guessed it right🥳");
					System.out.println("Number of attempts used: "+attempts);
					guessedCorrectly=true;
				}
			}else {
				System.out.println("you must enter a number between 1 - "+maxRange);
			}
		}
			
		if(!guessedCorrectly) {
			System.out.println("Oops! You ran out of attempts😒");
			System.out.println("The correct number is: "+ number);
		}
			
		sc.close();
		

	}

}