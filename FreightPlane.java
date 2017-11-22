
public class FreightPlane extends Plane {

	private int payload;
	
	public FreightPlane(String manufacturer, String type, int payload) {
		super(manufacturer, type);
		this.payload = payload;
	}
	
	public String toString(){
		String planeString;
		planeString = "Plane"+id+" "+manufacturer+" "+type+" "+"payload:"+payload;
		return planeString;
	}

	public int property() {
		return this.payload;
	}
}
