package multiArrays;
import java.util.Scanner;
public class SampleAssessment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);

System.out.println("How many students are in the class?");
int numStudents=input.nextInt();
int maxRow=numStudents;
int maxCol=2;
String lastName;
String firstName;
int firstLength=0;
//clear the buffer
input.nextLine();
String fullName;

String [][]fullNames=new String[maxRow][maxCol];
for(int row=0;row<maxRow;row++) {
		System.out.println("Please enter in the students' full name.");
		fullName=input.nextLine();
	
fullNames[row][0]=fullName.substring(0, fullName.indexOf(" "));
fullNames[row][1]=fullName.substring(fullName.indexOf(" ")+1);
firstLength+=fullNames[row][0].length();
//at 0 as the only want the first name 
		
	}

System.out.println("The average length of the first names are "+firstLength/numStudents);

for(int row=0;row<maxRow;row++) {
	for(int col=0; col<maxCol;col++) {
		
		System.out.println(fullNames[row][0] +" , "+ fullNames[row][1]);
		//column 0 for first name and column 1 for lastname
	}
	}

}
}

