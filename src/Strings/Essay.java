package Strings;

import java.util.Scanner;

public class Essay {

	private String name;
	private String text;

	public Essay() {
		name = "Bob Smith";
		text = "Hello World";
	}

	Scanner input = new Scanner(System.in);

	public void setName(String xName) {
		name = xName;
	}

	public void setText(String xText) {
		text = xText;
	}

	public String returnLast() {
		String last = name.substring(name.indexOf(" ")+ 1);
		return last.toUpperCase();

	}

	public int returnNumFirst() {
		String first = name.substring(0, name.indexOf(" "));
		return first.length();
	}

	public boolean containsX() {
		return name.toLowerCase().contains("x");

	}

	public int numWords() {
		int words = 1;
		for (int j = 0; j < text.length(); j++) {
			if (text.charAt(j) == ' ') {
				words++;

			}

		}
		return words;
	}

}
