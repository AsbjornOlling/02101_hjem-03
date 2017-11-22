public class Plane {
	
	private static final int DEFAULT_ID = 0;
	
	protected String manufacturer, type;
	int id;
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
	
	//denne metode skal sammenligne id nr paa to objekter af flyver.
	public boolean equals(Plane plane){
		// tjekker om objektet har den samme id som det Plane's id
		if (plane.id == this.id) {
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
