package OOP;

public class Numbers {
	//instance fields
	
	//contructors
	public Numbers() {
}
	//methods
	
	public void sayNumber(int num) { // can name variable whatever but not same ass method
		//made local variable and the value will be dropped into num
		System.out.println("You sent " + num +" to method");
		

	}
	//public cause public and anyone can call it and void as no return type
	public void sayNumberPlus2(int num) { // can use same variablee name as only running one methof at a time
		System.out.println("The number plus 2 is " + (num + 2));
	}
		
		public void saySum(int num1, int num2) {
			int result= num1 + num2;
			System.out.println(result);
		
	}

}