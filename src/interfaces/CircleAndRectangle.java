package interfaces;

import java.util.ArrayList;

public class CircleAndRectangle {
	public static void main(String[]args) {
	
		ArrayList <Shape> joe= new ArrayList <Shape>();
		joe.add(new Rectangle(1,1));
		joe.add(new Rectangle(2,2));
		joe.add(new Circle(1));
		joe.add(new Circle(2));
		
		int totalArea=0;
		
		for(Shape temp: joe) {
			totalArea+=temp.area();
		}
		
		double smallest=10000000;
		//or 
		//double smallPerim= (Shape) temp.get(0).perimeter();
		
		for(Shape temp2: joe) {
			if(temp2.perimeter() <smallest) {
				smallest=temp2.perimeter();
			}
		}
		
		System.out.println("The sum of all the areas of the objects in the array list is: "+ totalArea );
		System.out.println("The smallest perimeter is " +smallest);
	}


}
