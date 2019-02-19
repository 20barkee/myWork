package designingClasses;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NameSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names= new ArrayList<String>();
		Random generator=new Random();
		Scanner input=new Scanner(System.in);
	
		boolean isTrue=false;
		int min=400;
		int max=1600; 

		
			
			names.add("Joe");
			names.add("John");
			names.add("Luke");
			names.add("Mark");
			names.add("Paul");
			names.add("Saul");
			names.add("Jesus");
			names.add("Christ");
			names.add("Mary");
			names.add("Joseph");
	
			System.out.println("Pick a name");
			String nameChoice= input.nextLine();
	
			for(int i=0; i<10; i++) {
				if(nameChoice.equals(names)) {
					isTrue=true;
				}
			}
	
		System.out.println("It is " + isTrue + " that the name is a person in the array.");
		}
	}


