package ArrayLists;

public class SampleAssesment2ClassDef1 {
private String name;
private int numSiblings;
private int age;

public SampleAssesment2ClassDef1() {
	name=" ";
	numSiblings=0;
	age=0;
}
public SampleAssesment2ClassDef1(String xName, int xNumSiblings, int xAge) {
	if(xAge>0&&age<30) {
		age=xAge;
	}
	else
	{
		xAge=1;
		age=xAge;
	}
	
	if(xNumSiblings>0) {
		numSiblings=xNumSiblings;
	}
	else {
		numSiblings=0;
	}
}

public String getName() {
	return name;
}
public int getNumSiblings() {
	return numSiblings;
}
public int getAge() {
	return age;
}
}
