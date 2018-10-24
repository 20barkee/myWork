package OOP;

public class Rabbit {
private double population;

public Rabbit() {
	population=10;
}
public Rabbit(double newPopulation) {
	population= newPopulation;
}

public double getPopluation(){
	return population;
}

public void setPopulation(double xPopulation) {
	population= xPopulation;
}

public void matingSeason() {
	population= population*3;
}
public void huntingSeason() {
	population=population-(population*0.43);
}
}
