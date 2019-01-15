package ArrayLists;
import java.util.Scanner;
public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("How many students are in the class?");
		int userinput=input.nextInt();
		
		int sum=0;
int[]ages=new int[userinput];

for(int i=0; i<ages.length;i++) {
	System.out.println("Enter in the age of the student");
	ages[i]=input.nextInt();
	
}

for(int temp:ages) {
	sum+=temp;
}

System.out.println("Average: " + (sum/userinput));
	}

}
