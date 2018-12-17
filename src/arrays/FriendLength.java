package arrays;

import java.util.Scanner;

public class FriendLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);


		final int numFriends=5;
		int length;
		int userFirstName=0;

		String[] names= new String[numFriends];
		for(int i=0; i<numFriends; i++) {
			System.out.println("How long is the first name");
			userFirstName=input.nextInt();
	}
		for(int j=0; j<names.length; j++) {
			int firstName=names[j].indexOf(" ");
			if(userFirstName==firstName) {
				System.out.println(names[j]);
			}
		}
		}
		}

//fix this!!!
	


