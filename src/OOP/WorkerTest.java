package OOP;

public class WorkerTest {
	public static void main(String[] args) {
		Worker bob = new Worker();

		System.out.println("Bob worked " + bob.getHours());
		System.out.println("Bob makes " + bob.getHourlyPay());
		System.out.println("Pay BOB " + bob.payCheck());
		bob.raise(.4543);
		System.out.println("Bob makes " + bob.getHourlyPay());

		bob = new Worker(12, 3.75);
		System.out.println("Bob worked " + bob.getHours());
		System.out.println("Bob makes " + bob.getHourlyPay());
		System.out.println("Pay BOB " + bob.payCheck());
		bob.raise(.4543);
		System.out.println("Bob makes " + bob.getHourlyPay());

	}
}
