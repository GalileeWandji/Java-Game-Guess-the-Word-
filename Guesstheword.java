package game;

import java.util.Scanner;

public class Guesstheword {
	
	private boolean play = true;
	
	private Words randomwords = new Words();
	
	private Scanner scanner = new Scanner(System.in);
	
	private int rounds=10;
	
	private char lastRound;
	
	public void start() {
		
		
		do {
			showWord();
			getInput();
			checkInput();
			
		}while(play);
	}
	
	void showWord() {
		System.out.println(randomwords);
	}
	
	void getInput() {
		System.out.println("Enter a letter to guess the word:");
		String userGuess = scanner.nextLine();
		lastRound = userGuess.charAt(0);
		
	}
	
	void checkInput() {
		randomwords.guess(lastRound);
		
		if  (randomwords.isGuessedRight()) {
			System.out.println("Congrats you won");
			System.out.println("The word is " + randomwords);
			play = false;
		}

	}

	public void end() {
		scanner.close();

		
	}



}
