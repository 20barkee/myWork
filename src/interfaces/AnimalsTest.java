package interfaces;

import java.util.ArrayList;

public class AnimalsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList<Animal> CatandDog = new ArrayList <Animal>();
		Dog woof= new Dog();
		Cat meow= new Cat();
		Dog woof2= new Dog();
		Cat meow2=new Cat();
		
		CatandDog.add(woof);
		CatandDog.add(woof2);
		CatandDog.add(meow);
		CatandDog.add(meow2);
		
		for(Animal a: CatandDog) {
		a.act();
		System.out.println(a.toString());
		}
		
		if(woof instanceof Dog) {
			Dog bark= woof;
			bark.vet();
		}
		if(woof2 instanceof Dog) {
			Dog bark2= woof;
			bark2.vet();
		}

			for(int i= CatandDog.size()-1; i>0; i--) {
				if(meow instanceof Cat) {
					Cat purr= meow;
					if(purr.returnFriendly()==false) {
						CatandDog.remove(i);
						break;
						
					}
	

			
		}
			for(Animal b: CatandDog) {
				System.out.println("Animal info: " + b.toString());
			}
					
			}
	}

}
