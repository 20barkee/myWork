package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;
public class FirstActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
		ArrayList<String> people = new ArrayList<String>();

		people.add("Bob");
		people.add("Jane");
		people.add(1, "Billy");
		
		
		//System.out.println("What is your name?");
		//	String userName= input.nextLine();
		//people.add(2,userName);
	

		for(int i=0; i<people.size(); i++) {
			System.out.println(people.get(i));
		}

	}

}
