
public class FreightPlane extends Plane {

	private int payload;
	
	public FreightPlane(String manufacturer, String type, int payload) {
		super(manufacturer, type);
		this.payload = payload;
	}
	
	public String property() {
		return " payload:" + this.payload;
	}
}
