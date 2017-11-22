import java.util.ArrayList;

public class Airport {
	private ArrayList<Plane> landedPlanes = new ArrayList<Plane>();
	private int planesLanded;

	public Airport() {
	}

	// assign an id, and add to list of landed planes
	public void	land (Plane plane) {

		// dont add new plane, if it matches an existing id
		for( Plane p : landedPlanes ) {
			if (p.id == plane.id) {
				return;
			}
		}
		// if plane id unique
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
			string += "Plane";
			string += plane.id + " ";
			string += plane.manufacturer + " ";
			string += plane.type + " ";
			string += plane.property();
			string += "\n";
		} // loop
		return string;
	} // toString


} // class
