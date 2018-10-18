package OOP;

public class Cat {
private double age;
private double sleep;

public Cat(){
	age=102;
	sleep=57.7;
}
//alternate constructor
	public Cat(double xAge, double xSleep) {
		age= xAge;
		sleep=xSleep;
	}
	
	public double getAge() {
		return age;
	}
	public double getSleep() {
		return sleep;
	}
	
	public void setAge() {
	}
	public void birthday() {
		age= age+1;
	
	}
	public void sleepLess(double lessSleep) {
		sleep= sleep-lessSleep;
	}
	
	public void sleepMore(double moreSleep) {
		sleep= sleep+moreSleep;
	}
	
}
