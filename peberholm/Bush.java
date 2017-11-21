import java.awt.Color;
import java.awt.Point;

public class <Bush> extends Plant {
	private final int S = PeberholmConstantsAndUtilities.<BUSH>_SEED_NO;
	private final int R = PeberholmConstantsAndUtilities.<BUSH>_RANGE;

	private final int MIN_X;
	private final int MAX_X;
	private final int MIN_Y;
	private final int MAX_Y;

	// constructor
	public <Bush>(Point position) {
		this.position = position;

		// get color
		this.color = PeberholmConstantsAndUtilities.<BUSH>_COLOR;

		// calculate min and max coords
		MIN_X = this.position.x - R; // X
		MAX_X = this.position.x + R;
		MIN_Y = this.position.y - R; // Y
		MAX_Y = this.position.y + R;
	} // end constr.

	// returns an array the surviving plants
	public Plant[] spreadSeeds() {

		// make plant array with correct size
		Plant[] newPlants = new Plant[S];

		// make S new plants
		for (int i = 0; i < S; i++){
			newPlants[i] = new <Bush>(new Point(
				PeberholmConstantsAndUtilities.getRandomIntBetween(MIN_X,MAX_X),
				PeberholmConstantsAndUtilities.getRandomIntBetween(MIN_Y,MAX_Y)
			));
		} //loop

		// return the plants in an array
		return newPlants;
	} // spreadSeeds

	public String toString() {
		return "<Bush> position ["+position.x+";"+position.y+"]";
	}
} // bush
