package OOP;

public class PhoneTest {
	public static void main(String[] args) {
		Phone bob= new Phone();
		
		bob.setMyNumber(455523454);
		bob.setSpeedDial(1534234532);
		bob.setLastCall(345463445);
		bob.setNumCalls(4);
		bob.setNumMinutes(3443);
		
		System.out.println(bob.getMyNumber());
		System.out.println(bob.getSpeedDial());
		System.out.println(bob.getLastCall());
		System.out.println(bob.getNumCalls());
		System.out.println(bob.getNumMinutes());
		System.out.println(bob.getEMERGENCY());
		
		
		//System.out.println(bob.call(145433322, 3));
	
	
	
	}
}
