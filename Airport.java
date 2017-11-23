import java.util.ArrayList;

public class Airport {
	
	//The first method adds a plane to the those on the air port, and an assigns an a new id-number to that plane.
	//The id-numbers start with 1 and are then increased by 1.
	//If a plane wants to land which already has the id-number of plane on the airport, than is is not added.
	
	static ArrayList<Plane> planeList = new ArrayList<Plane>();
	int i=1;
	public void 	land (Plane plane) {
		for (int k=0;k<=planeList.size();k++) {
			if (!(planeList.contains(plane.id))) {
				plane.id = i;
				i++;
				planeList.add(plane);
			}
		}
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