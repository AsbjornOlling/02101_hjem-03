import java.util.ArrayList;

public class Airport {
	private ArrayList<Plane> landedPlanes = new ArrayList<Plane>();
	private int planesLanded;


	// assign an id, and add to list of landed planes
	public void	land (Plane plane) {
		// dont add new plane, if it matches an existing id
		for( Plane p : landedPlanes ) {
			if (p.id == plane.id) {
				return;
			}
		}

		// if plane id is unique, add it
		planesLanded++;
		plane.id = planesLanded;
		landedPlanes.add(plane);
	} // land


	// removes plane from list of landed planes
	public void start(int id) {
		// search the list for plane matching id
		int index = 0; // count indices manually in for-each lop
		for( Plane plane : landedPlanes ) {
			if (plane.id == id) {
				landedPlanes.remove(index);
				break;
			}
			index++;
		} // loop
	} // start


	// prints all the planes, with info
	public String toString() {
		String string = "";
		for(Plane plane : landedPlanes ) {
			System.out.println(plane);
		} // loop
		return string;
	} // toString
} // class
