package multiArrays;
import java.util.Scanner;
import OOP.Friend;

public class FullNamesActivity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
	final int maxRows=1;
	final int maxCol=2;
	
	
	String[][]friendNames=new String[maxRows][maxCol];
	
	for(int row=0; row<friendNames.length; row++) {
		for(int column=0; column<friendNames[0].length; column++) {
			System.out.println("Please enter in a full name");
			friendNames[row][column]=input.nextLine();
		}
	}
	for(int row=0; row<friendNames.length; row++) {
		for(int column=0; column<friendNames[0].length; column++) {
			int space=friendNames[row][column].indexOf(" ");
			
			System.out.println(friendNames[row][column].substring(space +1));
		}
		System.out.println();
	}
	}
	//sysout(friendNames[row][column].substring(friendNames[row][column].indexOf(" " +1);

}
