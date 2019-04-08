package Inheritance;

public class QuadrilateralTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Quadrilateral bob= new Quadrilateral();
		
		bob.setSide1(1);
		bob.setSide2(2);
		bob.setSide3(3);
		bob.setSide4(4);
		
		System.out.println("The perimeter of the quadrilateral is: " + bob.getPerimeter());
		

	}

}
