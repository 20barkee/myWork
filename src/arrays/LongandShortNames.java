package arrays;
import java.util.Scanner;
public class LongandShortNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
		
		System.out.println("How many people do you know????");
		int numPeople=input.nextInt();
		
		//clear the buffer
		input.nextLine();
		
		int largest=0;
		int smallest=999;
		String longestN= "Joe";
		String shortestN= "Joe2";
		int range=0;
		int average=0;
		
		String[] names= new String[numPeople];
		
		for(int i=0; i<numPeople; i++) {
			System.out.println("What is the persons name?");
			names [i]= input.nextLine();
	
		
			if(names[i].length()>=largest) {
				largest=names[i].length();
				longestN=names[i];
			}
			
			if(names[i].length()<=smallest) {
				smallest=names[i].length();
				shortestN=names[i];
				
				
			}
			range=longestN.length()-shortestN.length();
			average=names[i].length()/numPeople;
			//ask about how to better display the averages so it works
		}
	

		System.out.println("The longest name is "+ longestN);
		System.out.println("The shortest name is "+ shortestN);
		System.out.println("The range of letters between the names was "+ range);
		System.out.println("The average number of charaters in the name are " + average);
	}
}
