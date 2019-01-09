package ArrayLists;

import java.util.ArrayList;
import java.util.Random;

import OOP.Rectangle;

public class RemoveRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator=new Random();
		int min=50;
		int max=70;
		int randomNum=0;
		ArrayList<Rectangle>bob= new ArrayList<Rectangle>();
		//cant put size in here have to put it as less than the size in the loop
		
	for(int i=0; i<400;i++) {
		randomNum=1+generator.nextInt(max-min+1);
		bob.add(new Rectangle(randomNum, randomNum));
	}
	
	//remove the last rectangle and set it to the first element
	Rectangle temp=bob.remove(bob.size()-1);
	bob.set(0,temp);
	
	for(int j=bob.size()-1;j>=0;j--) {
		Rectangle buddy= bob.get(j);
		System.out.println(buddy.getArea());
	}

	}

}
