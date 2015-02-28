
public class Cycle {
	
	private int numberOfWheels;
	private int weight;
	
	public Cycle(){//default constructor
		this(100,1000);
	}
	public Cycle(int numberOfWheels, int weight){ // constructor 
		this.numberOfWheels = numberOfWheels;
		this.weight = weight;
	}
	@Override
	public String toString(){ //cycle objects are described by number of wheels and weight
		return "Number of wheels: "+numberOfWheels+"\nWeight: "+weight;
	}
}
