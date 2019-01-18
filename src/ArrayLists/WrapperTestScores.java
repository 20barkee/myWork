package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.Scanner;
public class WrapperTestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
System.out.println("How many test scores should be recorded?");
int numScores=input.nextInt();
ArrayList<Integer> wages= new ArrayList<Integer>();

int lowest=0;
int highest=0; 

for(int i=0; i<numScores;i++) {
System.out.println("Enter the test score...");
wages.add(input.nextInt());

	input.nextLine();
}
for(int num: wages) {
System.out.println(num);
if(highest<num) {
	highest=num;
	wages.set(wages.size()-1, highest);
}
if(lowest>num) {
	lowest=num;
	wages.set(0, lowest);
}
System.out.println(num);
	}}}

