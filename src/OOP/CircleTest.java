package OOP;

public class CircleTest {

public static void main(String [] args) {
	Circle bob= new Circle();
	bob.setRadius(5);
	
	System.out.println(bob.getRadius());
	System.out.println(bob.circumference());
	System.out.println(bob.area());
	
}
}
