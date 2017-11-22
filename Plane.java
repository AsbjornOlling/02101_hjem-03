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
		planeString = "Plane"+id+" "+manufacturer+" "+type;
		return planeString;
	}//end toString
	
	//denne metode skal sammenligne id nr paa to objekter af flyver.
	public boolean equals(Object o){
		boolean trueOrFalse=false;
		
		// tjekker om objektet har den samme id som det Plane's id
		if (o.equals(id)) {
		trueOrFalse = true;	
		}
		return trueOrFalse;
	}
	
	
	public int getId() {
		return id;
	}
	
	
	
}
