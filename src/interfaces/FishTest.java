package interfaces;

import java.util.ArrayList;

public class FishTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Fish> FishArray = new ArrayList <Fish>();
		
		GoldFish fishy= new GoldFish(6,21,"Blue");
		FishArray.add(fishy);
		
		Trout troutFish = new Trout(100,7, 10020);
		FishArray.add(troutFish);
		
		double maxLength=0; 
		
		String fishInfo= "";
		
		for(Fish b: FishArray) {
			if(b.getLength()> maxLength) {
				maxLength=b.getLength();
				fishInfo=b.toString();
			}
		}
		System.out.println("Longest Fish Info: " + fishInfo);
	
		String longestGold="";
	
	double maxLength2=0;
	
	for(Fish c: FishArray) {
		if(c instanceof GoldFish) {
			//have the array list and going through it, first seeing if its a 
			//goldfish and if it is create a new goldfish ov called "fish 3"
			//setting it equal to interface g but since its an interface you
			//have to cast it as a goldshish
			
			GoldFish fish3=(GoldFish) c;
			
				if(c.getLength()> maxLength2) {
					maxLength2=c.getLength();
					longestGold=fish3.getColor();
			}
			
		}
		
		}
	System.out.println("The color of the longest goldfish is " + longestGold);
	
	double OldestTrout=0;
	int maxAge=0;
	for(Fish t: FishArray) {
		if(t instanceof Trout) {
			Trout fish4=(Trout) t;
			if(fish4.getAge()>maxAge) {
				OldestTrout=fish4.getNumScales();
			}
		}
	}
	System.out.println("The number of scales on the oldest trout is: " + OldestTrout);
	
	}


}
//write two class definitions (inside of those are static fields- need to use it to invidiually number things (like dogs)
//also in class def are three methods (toString, equals, and clone)
//also writing an interface 
//test class with array list that you have to add things
//then go through the array list and call some methods on the things that are in there 

//static fields will only be used in the constructor to number each one


//Static fields: only one copy (in designing classing powerpoint)
