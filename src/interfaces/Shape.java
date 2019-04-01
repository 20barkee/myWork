package interfaces;

public interface Shape {

	// two method signitures that are in both the rectangle and circle class
	
	double perimeter();
	double area();
	
	//gain the flexiblilty of being able to put muktiple objects on right hand side, 
	//but lose the flexiblity as you can only use those two methods
}
