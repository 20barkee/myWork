package OOP;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle bob = new Rectangle();

		bob.setLength(4);
		bob.setWidth(5);

		System.out.println(bob.getLength());
		System.out.println(bob.getWidth());
		

		System.out.println(bob.getArea());
		System.out.println(bob.getPerimeter());
		
		bob= new Rectangle(7,9);
		System.out.println(bob.getLength());
		System.out.println(bob.getWidth());
		

		System.out.println(bob.getArea());
		System.out.println(bob.getPerimeter());

	}

}
