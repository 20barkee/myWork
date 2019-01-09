package ArrayLists;
import java.util.Random;

import java.util.ArrayList;

import OOP.Friend;
import OOP.Rectangle;

public class RectangleArray {

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
	for(int j=bob.size()-1;j>=0;j--) {
		Rectangle buddy= bob.get(j);
		System.out.println(buddy.getArea());
	}
		
	}

}
