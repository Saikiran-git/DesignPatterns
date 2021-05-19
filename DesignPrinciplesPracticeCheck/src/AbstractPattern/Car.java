package AbstractPattern;

public abstract class Car {

	CarType model=null;
	Location location=null;
	
	abstract void construct();

	Car(CarType model, Location location) 
	{
		this.model = model;
		this.location = location;
	}

	@Override
	public String toString() {
		return "CarModel is " + model + ", located in " + location;
	}

	CarType getModel() {
		return model;
	}

	void setModel(CarType model) {
		this.model = model;
	}

	Location getLocation() {
		return location;
	}

	void setLocation(Location location) {
		this.location = location;
	}
	
	
	
}
