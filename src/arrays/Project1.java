package arrays;
import java.util.Scanner;
public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	
		double sum=0;
		//declaration at the top
		double []scores=new double[5];
		for(int i=0; i<4;i++) {
		System.out.println("Please enter a test score");
		scores[i]=input.nextDouble();
		sum+=scores[i];
		

		}
		//for(int j=4; j>=0; j--) {
			//System.out.println(scores[j]);
		//}
		//shows the scores in opposite ways they were put in
		
		System.out.println(sum);
	}

}
