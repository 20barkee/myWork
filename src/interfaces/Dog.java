package interfaces;

import java.util.Random;

public class Dog implements Animal{
	
	private String name= "DogDog";
	private int age= 8;
	private boolean injured= false;
	
	
	Random generator=new Random();
	int max= 50;
	int min=1;
	int result= min+ generator.nextInt(max-min+1);
	
	public void act() {
		injured=false;
		age+=7;
		if(result==1) {
			injured=true;
		}
	}
	
	public String toString() {
		return "Dog name: " + name +". Dog age: " + age +". Is dog injured: " + injured;
	}

	public void vet() {
		injured= false;
	}
}
