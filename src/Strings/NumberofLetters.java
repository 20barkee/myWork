package Strings;

import java.util.Scanner;

public class NumberofLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a sentence");
		String sentence = input.nextLine();
		int i = 0;
		int numVowels = 0;
		int numLetters = 0;
		int numPuctuation = 0;
		int numSpaces = 0;
		int numConsonants = 0;
		for (i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i'
					|| sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u' || sentence.charAt(i) == 'y') {
				numVowels++;
			}
			if (sentence.charAt(i) != 'a' && sentence.charAt(i) != 'e' && sentence.charAt(i) != 'i'
					&& sentence.charAt(i) != 'o' && sentence.charAt(i) != 'u' && sentence.charAt(i) != 'y'
					&& sentence.charAt(i) != '.' && sentence.charAt(i) != '?' && sentence.charAt(i) != '!'
					&& sentence.charAt(i) != ',' && sentence.charAt(i) != ' ') {
				numConsonants++;
			}
			if (sentence.charAt(i) == '.' || sentence.charAt(i) == '?' || sentence.charAt(i) == '!'
					|| sentence.charAt(i) == ',') {
				numPuctuation++;
			}

		}

		System.out.println("There are " + numVowels + " vowels in the sentence");
		System.out.println("There are " + numConsonants + " consonants in the sentence");
		System.out.println("There are " + numPuctuation + " punctuation marks in the sentence");

	}

}
