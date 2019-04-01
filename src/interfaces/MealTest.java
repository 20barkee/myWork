package interfaces;

import java.util.ArrayList;
import java.util.Random;

public class MealTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Meal> MealArray = new ArrayList <Meal>();
		int min=1;  
		int max=3;
		Random generator= new Random();
		int randomNum=min+generator.nextInt(max-min+1);
		
		for(int j=0;j<25;j++) {
			if(randomNum==1) {
				MealArray.add(new Breakfast());
				break;
			}
			if(randomNum==2) {
				MealArray.add(new Lunch());
				break;
		}
			if(randomNum==3) {
				MealArray.add(new Dinner());
				break;
			}	
	}
		int count=0;
		int sum=0;
		
		for(Meal x: MealArray) {
			if(x instanceof Breakfast) {
				if(((Breakfast) x).getEggs()) {
					count ++;
				}
			}
			sum+=x.getCalories();
		}
		System.out.println("Number of breakfasts with eggs: "+ count);
		
		if(MealArray.size()>0) {
			System.out.println("Average calories per meal: " + (sum/MealArray.size()));
		}
		else
			System.out.println("No Meals Eaten");
		
		System.out.println("List of Desserts:");
		for(Meal x: MealArray) {
			//if (x instance of Dinner) {
				//System.out.println((Dinner)x.forDessert());
			//}
		}
		for(Meal x:MealArray) {
			if(x instanceof Lunch) {
				System.out.println(x.toString());
			}
		}
	
	}
}
