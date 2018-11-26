package loops;

public class ForLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int counter=0;
		//if you dont declare it ahead of time and delcare it inside of loop
		//then this is bad cause it will give an error message
		//can also use i and j as counting variables 
		//benifital to start at zero and go less than a number and just add one in the loop
		//			1.		2.			
		for(counter=1; counter<=5; counter=counter+1)
		{
			System.out.println(counter); //	3.
		}
	}

}
