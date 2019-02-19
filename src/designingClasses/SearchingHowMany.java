package designingClasses;

import java.util.Random;
import java.util.Scanner;

public class SearchingHowMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
		
		int[] num= new int[100];
		Random generator=new Random();
		
		
		boolean contains=false;
		int min=0;
		int max=9; 
		int numTimes=0;

		
		for(int i=0; i<9;i++) {
			
			num[i]=(min+generator.nextInt(max-min+1));
	}
		
		
		for(int temp:num) {

				numTimes++;
				System.out.println(num + " " + numTimes);
			}
			}
	
	
	}

}
