package loops;
import java.util.Scanner;
public class CashRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);

int numItems;
double cost;
double totalCost=0;
int counter=0;

System.out.println("How many items are there?");
numItems=input.nextInt();

for(counter=1; counter<=numItems; counter++)
{
	System.out.println("What is the cost of the item?");
	cost=input.nextDouble();
	
	totalCost=totalCost+cost;
	
}
System.out.println("The total cost is "+ totalCost);
double taxCost=(totalCost*.05);
System.out.println("The sales tax on the item is " + taxCost +"%");
System.out.println("The total cost of the items with tax is $" +(taxCost + totalCost));

	}

}
