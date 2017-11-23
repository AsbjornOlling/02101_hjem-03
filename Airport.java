import java.util.ArrayList;

public class Airport {
	
	
	static ArrayList<Plane> planeList = new ArrayList<Plane>();
	
	//i er variablen for id-nummre
	int idnr=1;
	
	// land tjekker om det valgte plane er paa planeList for Airport
	public void 	land (Plane plane) {
		
		// for loop, der taeller op til max index for planeList. Det starter med 0, da det foerste index i arrays kaldes 0.
		for (int k = 0 ; k < planeList.size() ; k++ ) {
			
			// Tjekker om flyet allerede findes i Airport, hvis dette er tilfaeldet stoppes loopet
			if ( planeList.get(k).equals(plane) ) {
				return;
			}
		}
		//Hvis plane ikke findes i listen, vil den få tildelt en id, og blive tilfoejet til listen
		plane.id=idnr;
		planeList.add(plane);
	
		//id'en taeller én op
		idnr++;
	}

	// start tjekker om det valgte plane er paa planeList for Airport
	public void start (int id) {
	
		// for loop, der taeller op til max index for planeList. Det starter med 0, da det foerste index i arrays kaldes 0.
		for (int k = 0 ; k < planeList.size() ; k++ ) {
		
			// Tjekker om flyet allerede findes i Airport, hvis dette er tilfaeldet fjernes dette plane fra planeList og loopet stoppes.
			if (planeList.get(k).equals(id)) {
			
				// fjerner plane fra planeList
				planeList.remove(k);
			
				// forlader loopet
				return;
			}
		}
		
	}
	
	//The last method list all planes currently on the airport, one per line in order of the landings.
	public String toString () {
		
		// Laver String uden value
		String stringPlaneList ="";
		
		//for loop der taeller mellem 0 og max antal planes i planeList
		for (int k=0 ; k < planeList.size() ; k++ ) {
		
			//Aendrer planeList til string, og laegger dem sammen i stringPlaneList, med et linjeskift efter hver planeinfo.
			stringPlaneList += planeList.get(k).toString()+"\n";
		}
		// returnerer stringen der kan printes
		return stringPlaneList;
		
	}
}
