public class PassengerPlane extends Plane {
	public int passengers;
	

	public PassengerPlane(String manufacturer, String type, int passengers) {
		super(manufacturer, type);
		this.passengers = passengers;
	}
	

	public String property() {
		return " seats:" + this.passengers;
	}
}
