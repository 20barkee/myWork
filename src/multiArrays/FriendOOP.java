package multiArrays;
import java.util.Random;
import OOP.Friend;

public class FriendOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Friend[][]friendNames=new Friend[18][5];
Random generator= new Random();
int min=0;
int max=0;
int ages;
for(int row=0; row<friendNames.length; row++) {
	for(int column=0; column<friendNames[0].length; column++) {

		friendNames[row][column]=new Friend();
		friendNames[row][column].setAge(generator.nextInt(101));
		
		
	}
}
for(int row=0; row<friendNames.length; row++) {
	for(int column=0; column<friendNames[0].length; column++) {
		System.out.println(friendNames[row][column].getAge()+ " ");
	}
}
for(int row=0; row<friendNames.length; row++) {
	for(int column=0; column<friendNames[0].length; column++) {
		System.out.println(friendNames[row][column].getAge()+" ");
	}
	}
System.out.println();
	}


