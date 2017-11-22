import java.util.ArrayList;

public class Airport {
	private ArrayList<Plane> landedPlanes = new ArrayList<Plane>();
	private int planesLanded;

	public Airport() {
	}

	// assign an id, and add to list of landed planes
	public void	land (Plane plane) {
		planesLanded++;
		plane.id = planesLanded;
		landedPlanes.add(plane);
	} // land


	// removes plane from list of landed planes
	public void start(int id) {
		// search the list for plane matching id
		int index = 0; // count indices manually in for-each lop
		for(Plane plane : landedPlanes ) {
			if (plane.id == id) {
				landedPlanes.remove(index);
			}
			index++;
		} // loop
	} // start


	// prints all the planes, with info
	public String toString() {
		String string = null;
		for(Plane plane : landedPlanes ) {
			string += "Plane";
			string += plane.id + " ";

			string += plane.manufacturer + " ";

			string += plane.type + " ";

			if ( plane instanceof FreightPlane ) {
				string += "payload:";
				string += plane.payload;
			} else if ( plane instanceof PassengerPlane ) {
				string += "seats";
				string += plane.passengers;
			}

			string += "\n";
		}
		return string;
	} // toString


} // class
