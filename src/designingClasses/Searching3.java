package designingClasses;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Searching3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> scores= new ArrayList<Integer>();
		Random generator=new Random();
		
Scanner input= new Scanner(System.in);
		
	boolean quit=false;
		int[] num= new int[100];
		
		
		boolean contains=false;
		int min=1;
		int max=8; 
		int numTimes=0;

		
		for(int i=0; i<100;i++) {
			
			num[i]=(min+generator.nextInt(max-min+1));
	}
		while(quit==false) {
		System.out.println("Chose a number");
		int choice=input.nextInt();
		
		for(int temp:num) {
			if(temp==choice) {
				contains=true;
				numTimes++;
			}
			}
		System.out.println("Is " + "choice one of the scores? " + contains + " It appears " + numTimes + " times.");
		
		
		System.out.println("Would you like to quit?");
quit=input.nextBoolean();
		}
		System.out.println("The End!");
}}
