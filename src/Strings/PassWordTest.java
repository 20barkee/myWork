package Strings;

import java.util.Scanner;

public class PassWordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		PassWord bob = new PassWord();

	
		int enterAttempts = 0;
		int confirmAttempts = 0;
		
		System.out.println("Please enter your password in the format LastName:Password");
		String thing = input.nextLine();

		String realPassword = thing.substring(thing.indexOf(":")+1 );
		enterAttempts++;

		while (bob.setPassword(realPassword) == false) {
			System.out.println("Please enter your password in the format LastName:Password");
			thing = input.nextLine();

			realPassword = thing.substring(thing.indexOf(":") + 1);
			enterAttempts++;
		}
		while (bob.setPassword(realPassword) == true) {
			System.out.println("Please confirm your password");
			String confirm = input.nextLine();
			confirmAttempts++;
			while (bob.match(confirm) == false) {
				System.out.println("Please confirm your password");
				confirm = input.nextLine();
				confirmAttempts++;
			}
		while (bob.setPassword(confirm) == true) {
				System.out.println("Congrats");
			}

		}

		System.out.println("It took " + enterAttempts + " to enter a valid password.");
		System.out.println("It took " + confirmAttempts + " to enter a valid password.");

	}

}