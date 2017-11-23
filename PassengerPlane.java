
public class PassengerPlane extends Plane {

	// antal seats optaget
	private int passengers;
	
	public PassengerPlane(String manufacturer, String type, int passengers) {
		super(manufacturer, type);
		this.passengers = passengers;
	}
	// skriver det ud som string
	public String toString(){
		String planeString;
		planeString = "Plane"+id+" "+manufacturer+" "+type+" "+"seats:"+passengers;
		return planeString;
	}

}
