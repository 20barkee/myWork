package searching;

import java.util.ArrayList;
import java.util.Random;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 0;
		int max = 10000000;

		Random generator = new Random();

		ArrayList<CatStart> cat = new ArrayList<CatStart>();
		Random gen = new Random();
		int randomNum = 0;
		int num = 100;

		for (int i = 0; i < 100; i++) {
			randomNum = gen.nextInt(20);
			cat.add(new CatStart(randomNum, randomNum));
		}

		CatStart smallest = cat.get(0);
		CatStart largest = cat.get(0);

		for (CatStart temp : cat) {

			if (temp.compareTo(smallest) < 0) {
				smallest = temp;
			}

			if (temp.compareTo(largest) > 0) {
				largest = temp;

			}
		}

		System.out.println("The smallest cat age is " + smallest.getAge());
		System.out.println("The largest cat age is " + largest.getAge());
	}

}
