package arrays;

public class MallSanta {
private String name;
private int age;
private boolean criminal;

public MallSanta(String xName, int xAge, boolean xCriminal) {
	name=xName;
	age=xAge;
	criminal=xCriminal;	
}

public String getName() {
	return name;
}
public boolean employable() {
	if(age>=50 &&age<=70) {
		if(criminal==false) {
			return true;
		}
	}
	
		return false;
	
}
}

