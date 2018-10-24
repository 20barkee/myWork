package OOP;

public class CatTest {
public static void main(String[] args) {
	Cat bob= new Cat(6,13); 

	System.out.println(bob.getAge());
	System.out.println(bob.getSleep());
	bob.birthday();
	System.out.println(bob.getAge());//same method but when run bob.birthday the insatnce field changes so it displays a different number
	bob.sleepLess(4);
	System.out.println(bob.getSleep());
	bob.sleepMore(7);
	System.out.println(bob.getSleep());
	
	
}
}
