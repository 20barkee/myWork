package OOP;

public class RabbitTest {
public static void main(String []args) {
	
	
	Rabbit bob= new Rabbit();
	//double population=10;
	bob.setPopulation(5);
	System.out.println("The current rabbit population is " + bob.getPopluation());
	bob.setPopulation(100);
	System.out.println("The rabbit population is now " + bob.getPopluation());
	
	bob.matingSeason();
	System.out.println("After mating season the population is " + bob.getPopluation());
	
	bob.huntingSeason();
	System.out.println("After hunting season the popluation is "+bob.getPopluation());
	
	bob= new Rabbit(9);
	System.out.println("The current rabbit population is now "+ bob.getPopluation());
}
}
