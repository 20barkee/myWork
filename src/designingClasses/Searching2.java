package designingClasses;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Searching2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
		
		int[] num= new int[100];
		Random generator=new Random();
		
		
		boolean contains=false;
		int min=0;
		int max=499; 
		int numTimes=0;

		
		for(int i=0; i<100;i++) {
			
			num[i]=(min+generator.nextInt(max-min+1));
	}
		System.out.println("Chose a number");
		int choice=input.nextInt();
		
		for(int temp:num) {
			if(temp==choice) {
				contains=true;
				numTimes++;
			}
			}
		System.out.println("Is " + "choice one of the scores? " + contains + " It appears " + numTimes + " times.");
		}
		
	}


