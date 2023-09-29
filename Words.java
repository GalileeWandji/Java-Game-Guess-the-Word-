package game;

import java.util.Random;

public class Words {
	
	private String[] randomwords = {"animals", "happiness", "indefinite","study", "birthday", 
			"extreme", "rights","properties", "ceremony", "independence", "breath", "information",
			"student", "employee"};
	
	private String selectedword;
	
	private Random random = new Random();
	private char[] letters;
	
	public Words() {
		selectedword = randomwords[random.nextInt(randomwords.length)];
		letters = new char[selectedword.length()];
	}
	
	public String toString() {
		StringBuilder text = new StringBuilder();
		
		
		for(char letter: letters) {
			
			text.append(letter == '\u0000' ? '-': letter); 

			text.append(' ');
		}
		
		
		return text.toString();
	}
	
	public boolean isGuessedRight() {
		for(char letter: letters) {
			if(letter == '\u0000') {
				return false;
			}
		}
		return true;
		
		
	}

	public void guess(char letter) {

		for(int i=0; i<selectedword.length(); i++) {
			if(letter == selectedword.charAt(i)) {
				letters[i] = letter;
			}

		}
	}
 
}
