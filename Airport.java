import java.util.ArrayList;

public class Airport {
	
	//The first method adds a plane to the those on the air port, and an assigns an a new id-number to that plane.
	//The id-numbers start with 1 and are then increased by 1.
	//If a plane wants to land which already has the id-number of plane on the airport, than is is not added.
	
	static ArrayList<String> planeList = new ArrayList<String>();
	int i=1;
	public void 	land (Plane plane) {
		plane.id = i;
		i++;
		planeList.add(plane.toString());
	}
	
	//The second method removes the plane plane from those on the airport if it was actually there.
	public void start (int id) {
		if (planeList.contains(id)) {
			planeList.remove(id);
		}
		
	}
	
	//The last method list all planes currently on the airport, one per line in order of the landings.
	//lige nu printer den Arraylist direkte
	public String toString () {
		String stringPlaneList = planeList.toString();
		return stringPlaneList;
		
	}
}