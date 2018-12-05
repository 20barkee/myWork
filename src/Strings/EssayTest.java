package Strings;

public class EssayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Essay bob = new Essay();

		bob.setName("John Doe");
		bob.setText("Text text text text and text.");
		System.out.println("The authors last name is " + bob.returnLast());

		System.out.println("There are " + bob.returnNumFirst() + " letters in the first name");
		System.out.println("The letter x is in the authors name: " + bob.containsX());
		System.out.println("There are " + bob.numWords() + " words in the essay.");
	}

}
