package designingClasses;
import java.util.ArrayList;
import java.util.Scanner;

import OOP.Rectangle;
public class GreeterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);

ArrayList<GreeterBase>bob= new ArrayList<GreeterBase>();

System.out.println("How many Greeters would you like to construct?");
int numGreeters=input.nextInt();

for(int i=0; i<numGreeters; i++) {
	bob.add(new GreeterBase());
}
for(int i=0; i<numGreeters; i++) {
	bob.get(i);
}
	}

}
