package multiArrays;

import java.util.Random;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator=new Random();
		int min=0;
		int max=100;
		int numRows=3;
		int numCol=7;
		int sum=0;
		
		int[][]numbers=new int[numRows][numCol];
	
		
		for(int rows=0; rows<numbers.length;rows++) {
			for(int columns=0; columns<numbers[0].length;columns++) {
				numbers[rows][columns] = min + generator.nextInt(max - min + 1);
			}
			}
		for(int rows=0; rows<numbers.length;rows++) {
			for(int columns=0; columns<numbers[0].length;columns++) {
				sum+=numbers[rows][columns];
			}
		}
		System.out.println("The sum of all of the elements in the array is "+ sum);
			}
	}


