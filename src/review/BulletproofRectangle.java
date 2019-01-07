package review;

import java.util.Random;
import java.util.Scanner;

public class BulletproofRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Random generator= new Random();
		int randomNum=0;
		int sum=0;
				Rectangle123[][] shape= new Rectangle123[3][4];
				
				
				for(int row=0; row<shape.length;row++) {
					for(int col=0;col<shape[0].length;col++) {
					randomNum=1+generator.nextInt(25-1+1);
				shape[row][col]= new Rectangle123(randomNum,randomNum);
					
					
				sum+=shape[row][col].perimeter();
			
					
					}	
					}
				System.out.println("The sum of the area is: "+ sum);
		
		
	}

}
