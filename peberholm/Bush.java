import java.awt.Point;
import java.util.ArrayList;

public class Bush extends Plant {
	private final int S = PeberholmConstantsAndUtilities.BUSH_SEED_NO;
	private final int R = PeberholmConstantsAndUtilities.BUSH_RANGE;

	private final int minX;
	private final int maxX;
	private final int minY;
	private final int maxY;

	// constructor
	public Bush(Point position) {
		this.position = position;

		// get min and max coords
		minX = this.position.x - R; // X
		maxX = this.position.x + R;
		minY = this.position.y - R; // Y
		maxY = this.position.y + R;
	} // end constr.

	// returns an array the surviving plants
	public Plant[] spreadSeeds() {

		// temporary list, because we don't yet know, 
		// if the seeds land in water
		ArrayList<Plant> newPlants = new ArrayList<Plant>();

		// make SEED_NO new plants
		for (int i = 0; i < S; i++){
			// make new plant coords
			Point newCoord = new Point(
				PeberholmConstantsAndUtilities.getRandomIntBetween(minX,maxX),
				PeberholmConstantsAndUtilities.getRandomIntBetween(minY,maxY)
			);

			// if it's on the island. add it
			if ( PeberholmConstantsAndUtilities.positionOK(newCoord) ) {
				newPlants.add(new Bush(newCoord));
			}
		} // loop

		// return the plants that didn't land in water
		return newPlants.toArray(new Plant[newPlants.size()]);
	} // spreadSeeds


} // bush
