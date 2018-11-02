package decisionStructres;

public class Practice343 {
private double length;

public Practice343() {
	length=0;
}
public Practice343(double xLength){
	if(xLength<0)
	{
		xLength=0;
	}
	length=xLength;	
}
public double area() {
	return length*length;
}
}

