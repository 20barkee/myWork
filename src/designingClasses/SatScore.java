package designingClasses;

import java.util.ArrayList;
import java.util.Random;
public class SatScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> scores= new ArrayList<Integer>();
		Random generator=new Random();
		
		
		boolean contains=false;
		int min=400;
		int max=1600; 

		
		for(int i=0; i<1000;i++) {
			
			scores.add(min+generator.nextInt(max-min+1));
	}
		
		for(int temp:scores) {
			if(temp==1500) {
				contains=true;
			}
			}
		System.out.println("Is 1500 one of the scores? " + contains);
		}
	

}
