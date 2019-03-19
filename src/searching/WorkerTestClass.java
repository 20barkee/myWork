package searching;

import java.util.Random;

public class WorkerTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int min = 0;
		int max = 100;
		
		Random generator = new Random();
		
		DadSchool[] people= new DadSchool[100];
			
		for(int i=0; i<100;i++) {
			double randomNum = (Math.random() * ((max - min) + 1)) + min;
			people [i] = new DadSchool(randomNum, randomNum);
		}
		
		//Set the smallest to the first element 
		DadSchool smallest= people[0];
		
		//Go through the array and determine the smallest element
		for(int i=1; i<people.length; i++) {
			if(smallest.compareTo(people[i]) <0) {
				smallest=people[i];
			}
		}
		
		//cant just put in "Smallest" as smallest is an object variable
		System.out.println("The smallest element is number " + smallest.getRate());
		
		
	}

}
