package Inheritance;

public class EmployeeWorkerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee bob= new Employee("Mary", 12);
		Worker joe=new Worker("Joe", 86);
		Manager fred=new Manager("Fred", 8);
				
		System.out.println(joe.toString());
		System.out.println("The pay for the employee is $"+ joe.CalculatePay(6));
		System.out.println("The pay for the employee is $"+ joe.CalculatePay(12));
		System.out.println("The pay for the worker is $"+ bob.CalculatePay(7));
		System.out.println("The pay for the manager is $"+fred.CalculatePay(44));
		
	}

}
