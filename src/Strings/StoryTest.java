package Strings;
import java.util.Scanner;
public class StoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter a story.");
		Story bob=new Story(input.nextLine());
		
		System.out.println("There are " + bob.wordCount() + " words in the story.");
		System.out.println("The first word of the story is: " + bob.firstWord());
		
		
	}

}
