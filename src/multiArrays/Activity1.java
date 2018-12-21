package multiArrays;
import java.util.Random;
public class Activity1 {
public static void main(String[]args) {
	Random generator=new Random();
	int min=0;
	int max=100;
	int numRows=14;
	int numCol=9;
	
	int[][]numbers=new int[numRows][numCol];
	//want to eliminate just putting numbers in
	//use the length constant
	//or for the number of rows create a constant or ask for the input dont just type in like 4
	//number of rows: numbers.length
	//number of columns: numbers[0].length
	
	for(int rows=0; rows<numbers.length;rows++) {
		for(int columns=0; columns<numbers[0].length;columns++) {
			numbers[rows][columns] = min + generator.nextInt(max - min + 1);
			//maybe separate the input and output in the future
			System.out.println(numbers[rows][columns] + " ");
		System.out.println();
		}
	}
}
}
