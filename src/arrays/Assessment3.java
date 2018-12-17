package arrays;
import java.util.Scanner;
public class Assessment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);

int numTeachers=1;
String[] names = new String[1];

for(int i=0; i<numTeachers;i++) {
	System.out.println("Please enter the teachers name in the following format (First Last)");
	names[i]=input.nextLine();
}
double sum=0;
for(int j=0; j<numTeachers;j++) {
	sum=sum+(names[j].length()-names[j].indexOf(" ")-1);
}
System.out.println("The average length of the names " + (sum/names.length));
	}

}
