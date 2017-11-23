public class Plane {
	private static final int DEFAULT_ID = 0;
	
	public String manufacturer, type;
	public int id;
	/*
	 * @param manufacturer
	 * @param type
	 * @param id
	 */
	
	
	public Plane(String manufacturer, String type) {
		this.manufacturer = manufacturer;
		this.type = type;
		this.id = DEFAULT_ID;
	}
	

	public void setId(int id){
		this.id = id;
	}
	

	// Skriver det ud som String
	public String toString(){
		String planeString;
		planeString = "Plane"+id+" "+manufacturer+" "+type+property();
		return planeString;
	}//end toString
	

	// sammenligner id-feltet i to objekter
	public boolean equals(Object o){
		if ( ((Plane) o).id == this.id) {
			return true;
		} else { 
			return false;
		}
	}
	

	public int getId() {
		return id;
	}


	public String property() {
		return "";
	}
}
