import java.awt.Point;

public class PeberholmSimulationChecker {

	public PeberholmSimulationChecker() {
		Bush bush = new Bush(new Point(76,1));
		System.out.println(bush);
		bush.spreadSeeds();
		
	} // constructor

} // class
