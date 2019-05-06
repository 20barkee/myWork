package springBreakReview;

import java.util.ArrayList;

public class Quadratic implements Polynomial {
	private ArrayList<Monomial> x;

	public Quadratic(ArrayList<Monomial> y) {
		x = y;
	}

	public int getDegree() {
		return 2;
	}

	public String getName() {
		if (x.size() == 3) {
			return "Quadratic Trinomial";
		}
		if (x.size() == 2) {
			return "Quadratic Binomial";
		}
		if (x.size() == 1) {
			return "Quadratic Monomial";
		}
		else {
			return"Idk didnt work :(((";
		}
	}

	public int getNumTerms() {
		return x.size();
	}
	public boolean hasRoots(double a, double b, double c) {
		double determinant=(b*b)-(4*a*c);
		if(determinant>=0) {
			return true;
		}
		else {
			return false;
		}
	}

}
