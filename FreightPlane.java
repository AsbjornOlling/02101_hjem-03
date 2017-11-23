
public class FreightPlane extends Plane {

	// variabel for payload
	private int payload;
	
	public FreightPlane(String manufacturer, String type, int payload) {
		super(manufacturer, type);
		this.payload = payload;
	}
	
	//skriver det ud som tekst
	public String toString(){
		String planeString;
		planeString = "Plane"+id+" "+manufacturer+" "+type+" "+"payload:"+payload;
		return planeString;
	}
}
