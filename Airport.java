import java.util.ArrayList;

public class Airport {
	private static ArrayList<Plane> landedPlanes = new ArrayList<Plane>();
	private static int planesLanded;

	// assign an id, and add to list of landed planes
	public void	land (Plane plane) {
		planesLanded++;
		plane.id = planesLanded;
		landedPlanes.add(plane);
	}


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


} // class
