package review;
import java.util.Scanner;
import java.util.Random;
public class BulletproofCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
Random generator= new Random();
int randomNum=0;
int sum=0;
		circle123[] radii= new circle123[3];
		
		
		for(int i=0; i<3;i++) {
			randomNum=1+generator.nextInt(10-5+1);
			circle123 shape= new circle123(i);
			radii[i]=shape;
			sum+= radii[i].area();
	
			
				
			}
		System.out.println("The sum of the area is: "+ sum);
		}
	
		
	}


