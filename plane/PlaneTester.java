
public class PlaneTester {
	
	public static void main (String[] args) {

	    Plane p1 = new Plane("Cessna","Skyhawk");
	    Plane p2 = new Plane("Piper","Matix");
	    Plane p3 = new Plane("Piper","Matix");
	    System.out.println(p1);
	    System.out.println(p2);
	    System.out.println(p3);
	    System.out.println();
	    System.out.println(p1.equals(p1));
	    System.out.println(p1.equals(p2));
	    System.out.println(p1.equals(p3));
	    System.out.println(p2.equals(p1));
	    System.out.println(p2.equals(p2));
	    System.out.println(p2.equals(p3));
	    System.out.println(p3.equals(p1));
	    System.out.println(p3.equals(p2));
	    System.out.println(p3.equals(p3));
	    
	    p2.setId(27);
	    System.out.println(p1);
	    System.out.println(p2);
	    System.out.println(p3);
	    System.out.println();
	    System.out.println(p2.equals(p1));
	    System.out.println(p2.equals(p2));
	    System.out.println(p2.equals(p3));
	    System.out.println();
        PassengerPlane p8 = new PassengerPlane("Boing","737",241);
        FreightPlane p7 = new FreightPlane("Antonov","124",110); 
        FreightPlane p6 = new FreightPlane("Boing","747F",112); 
        PassengerPlane p4 = new PassengerPlane("Airbus","321",192);
        PassengerPlane p5 = new PassengerPlane("Airbus","380",853); 
        System.out.println(p8);
        System.out.println(p7);
        System.out.println(p6);
        System.out.println(p4);
        System.out.println(p5);
	}
}
