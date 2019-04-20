package Inheritance;

public class BallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Basketball bob= new Basketball();
		
//when you make the method call (to method 1&2) you are referencing the basketball method as you always go from the outside in
		System.out.println(bob.method1());
		System.out.println(bob.method2());
		System.out.println(bob.method3());
		
		
//can call any of the methods inside of the sub class or the superclass, just have to go in the super class for this one
		System.out.println(bob.method4());
		
		Ball joe= new Basketball();
		
		//outprints basketball as polymorphism takes over and does not care how you got there and will keep going further in
		System.out.println(joe.method1());
		System.out.println(joe.method2());
		//cannot call three as it only knows how to call the methods that are inside of the superclass
		//System.out.println(joe.method3());
		System.out.println(joe.method4());
		
		//when superclass reference to a subclass object- can only call the methods in the superclass object
		
		
	}

}
