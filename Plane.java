


public class Plane {
	
	
	private static final int DEFAULT_ID = 0;
	
	protected String manufacturer, type;
	int id;
	/**
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
	
	public String toString(){
		// din kode 
	}
	//denne metode skal sammenligne id nr på to objekter af flyver.
	
	public boolean equals(Object o){
		// din kode 
	}
	
	public int getId() {
		return id;
	}
	
	
	
}
