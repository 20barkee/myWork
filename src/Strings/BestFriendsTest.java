package Strings;
import java.util.Scanner;
public class BestFriendsTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);

		BestFreinds bob= new BestFreinds();
	
		System.out.println("Who is your new best friend?");
		String friend=input.nextLine();
		System.out.println("What is their ranking?");
		int ranking=input.nextInt();
		
		bob.changeFriend(friend, ranking);
		System.out.println(bob.changeFriend(friend,ranking));
		
		String bestBud=bob.getFriend1();
		System.out.println(bestBud.charAt(0));
		System.out.println("The length of the third friends last name is " + bob.getLastLength());
	}

}
