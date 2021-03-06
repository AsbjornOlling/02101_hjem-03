import java.awt.Color;
import java.awt.Point;

public class <Type> extends Plant {
	private final int S = PeberholmConstantsAndUtilities.<TYPE>_SEED_NO;
	private final int R = PeberholmConstantsAndUtilities.<TYPE>_RANGE;

	private final int MIN_X;
	private final int MAX_X;
	private final int MIN_Y;
	private final int MAX_Y;

	// constructor
	public <Type>(Point position) {
		this.position = position;

		// get color
		this.color = PeberholmConstantsAndUtilities.<TYPE>_COLOR;

		// calculate min and max coords
		MIN_X = this.position.x - R; // X
		MAX_X = this.position.x + R;
		MIN_Y = this.position.y - R; // Y
		MAX_Y = this.position.y + R;
	} // end constr.

	// returns an array of new plants
	public Plant[] spreadSeeds() {
		// make plant array with correct size
		Plant[] newPlants = new Plant[S];

		// make S new plant objects
		for (int i = 0; i < S; i++){
			newPlants[i] = new <Type>(new Point(
				PeberholmConstantsAndUtilities.getRandomIntBetween(MIN_X,MAX_X),
				PeberholmConstantsAndUtilities.getRandomIntBetween(MIN_Y,MAX_Y)
			));
		} //loop

		return newPlants;
	} // spreadSeeds

	public String toString() {
		return "<Type> position ["+position.x+";"+position.y+"]";
	}
} // class
