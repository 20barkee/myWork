package arrays;

import OOP.Rectangle;
import java.util.Scanner;
import java.util.Random;
public class RectangleArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);

		Rectangle[] bob= new Rectangle[5];
		int min=10;
		int max=56;
		Random generator= new Random();
		
		
		double length;
		double width;
				
	length = (Math.random() * ((max - min) + 1)) + min;
	width= (Math.random() * ((max - min) + 1)) + min;
	
	System.out.println(length);
	System.out.println();
		
		//look up answers on video 
	}

}
