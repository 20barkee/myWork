package mathOperators;
 import java.util.Scanner;
public class MusicSongs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		
		double totalLength;
		double totalSongs;
		double decimalLength;
		double average;
		double minutes;
		double seconds;
		
		System.out.println("How many songs are there?");
		totalSongs=input.nextDouble();
		System.out.println("What is the total length of the songs?");
		totalLength =input.nextDouble();
		
		decimalLength= totalLength * 60;
		average= decimalLength/totalSongs; 
		minutes= average/60;
		
		minutes= (int)minutes;
		seconds= average- (minutes * 60);
	
		
		
		System.out.println("The avarage song length is " + minutes + " minute(s) long and  " + seconds + " second(s) long.");
		input.close();
	}

}
