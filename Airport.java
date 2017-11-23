import java.util.ArrayList;

public class Airport {
	
	//The first method adds a plane to the those on the air port, and an assigns an a new id-number to that plane.
	//The id-numbers start with 1 and are then increased by 1.
	//If a plane wants to land which already has the id-number of plane on the airport, than is is not added.
	// Liste over planes i Airport
	static ArrayList<Plane> planeList = new ArrayList<Plane>();
	
	//
	public void 	land (Plane plane) {
		
		// for loop, der tjekker om et fly allerede holder i Airport
		for (int k = 0 ; k <= planeList.size() ; k++ ) {
			// Tjekker om flyet allerede findes i Airport, hvis dette ikke er tilfældet tilføjes det til listen
			if ( !(planeList.get(k).equals(plane) ) ) { // TODO hej oliver - den her er bare skrevet lidt mindre end før :)
				break;
			}
		}
		// TODO - tilføj fly til planeList liiige her
	}
	
	int j;
	//The second method removes the plane plane from those on the airport if it was actually there.
	public void start (int id) {
		for (j=j;j<=planeList.size();j++) {
			if (planeList.contains(id)) {
				planeList.remove(j);
				break;
			}
		}
		
	}
	
	//The last method list all planes currently on the airport, one per line in order of the landings.
	//lige nu printer den Arraylist direkte
	public String toString () {
		String stringPlaneList = planeList.toString();
		return stringPlaneList;
		
	}
}
