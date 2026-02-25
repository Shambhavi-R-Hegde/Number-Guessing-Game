package numberguessinggame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		int number=random.nextInt(100)+1;
		int attempts=0;
		boolean guessedCorrectly=false;
		
		while(attempts<7&&!guessedCorrectly) {
			System.out.println("Please Enter a guess a number between 1 to 100:");
			int guess=sc.nextInt();
			attempts++;
			if(guess>=1&&guess<=100) {
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
				System.out.println("you must enter a number between 0 to 100.");
			}
		}
			
		if(!guessedCorrectly) {
			System.out.println("Oops! You ran out of attempts😒");
			System.out.println("The correct number is: "+ number);
		}
			
		sc.close();
		

	}

}