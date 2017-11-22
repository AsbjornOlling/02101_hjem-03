
public class PassengerPlane extends Plane {

	private int passengers;
	
	public PassengerPlane(String manufacturer, String type, int passengers) {
		super(manufacturer, type);
		this.passengers = passengers;
	}
	
	public String toString(){
		String planeString;
		planeString = "Plane"+id+" "+manufacturer+" "+type+" "+"passengers:"+passengers;
		return planeString;
	}

}
