package mathOperators;

import java.util.Scanner;

public class age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			int age = -999;
			int future = -999;
			Scanner input =new Scanner(System.in);

			System.out.println("How old are you?");
			age = input.nextInt();
	     	future= 18 - age;
				
          	System.out.println("You will be able to vote in " + future + " years.");
			
		 input.close();

	}

}
