package arrays;
import java.util.Scanner;
public class FriendNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);


final int numFriends=5;
String letterString;
char letter;

String[] friend= new String[numFriends];
for (int i = 0; i < numFriends; i++) {
	System.out.println("Enter the name of the friend");
	friend [i] = input.nextLine();	
	}
System.out.println("Please enter a letter.");
letterString=input.nextLine();
char letterz=letterString.charAt(0);

for(int j=0; j<friend.length; j++) {
	int length=friend[j].length();
	char lastLetter= friend[j].charAt(length-1);
	if(lastLetter==letterz) {
		System.out.println(friend[j]);
}
}


//shows names in reverse order
//for(int j=friend.length-1; j>=0; j--) {
//System.out.println(friend[j]);
//}
}
}