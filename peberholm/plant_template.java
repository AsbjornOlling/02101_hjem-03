import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

public class Type extends Plant {
	private final int S = PeberholmConstantsAndUtilities.TYPE_SEED_NO;
	private final int R = PeberholmConstantsAndUtilities.TYPE_RANGE;

	private final int MIN_X;
	private final int MAX_X;
	private final int MIN_Y;
	private final int MAX_Y;

	// constructor
	public Type(Point position) {
		this.position = position;

		// get color
		this.color = PeberholmConstantsAndUtilities.TYPE_COLOR;

		// calculate min and max coords
		MIN_X = this.position.x - R; // X
		MAX_X = this.position.x + R;
		MIN_Y = this.position.y - R; // Y
		MAX_Y = this.position.y + R;
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
				PeberholmConstantsAndUtilities.getRandomIntBetween(MIN_X,MAX_X),
				PeberholmConstantsAndUtilities.getRandomIntBetween(MIN_Y,MAX_Y)
			);

			// add the new bush, without checking jack shit
			newPlants.add(new Type(newCoord));
		} //loop

		// return the plants in an array
		return newPlants.toArray(new Plant[newPlants.size()]);
	} // spreadSeeds

	public String toString() {
		return "Type position ["+position.x+";"+position.y+"]";
	}
} // bush
