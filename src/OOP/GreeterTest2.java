package OOP;

public class GreeterTest2 {
public static void main (String [] args) {
	
	Greeter2 bob= new Greeter2();
	
	System.out.println(bob.getAge());
	
	bob.setAge(4); //needed to pass it a value to test to see if it works
	System.out.println(bob.getAge());
	
}
}
