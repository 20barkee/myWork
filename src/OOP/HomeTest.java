package OOP;

import java.util.Scanner;


public class HomeTest {
	public static void main(String [] args) {
	
		
		Home test= new Home();
		test.paintWall();
		
		 Scanner input= new Scanner(System.in);
		 Home myHouse = new Home();
	
		 System.out.println("What is the length of the garden?");
		 double length= input.nextDouble();
		 System.out.println("How many rows are in the garden?");
		 int rows= input.nextInt();
		 myHouse.plantGarden(length, rows);
		 
		 
		 System.out.println("What is the radius of the pool?");
		 double radius = input.nextDouble();
		 System.out.println("What is the height of the pool?");
		 double height = input.nextDouble();
		 myHouse.fillPool(radius, height);
		 
		 //input.close();
	}
	

}
