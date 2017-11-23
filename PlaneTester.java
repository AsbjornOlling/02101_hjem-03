
public class PlaneTester {
	
	public static void main (String[] args) {
		/*
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
        */
        // Airport-test
        Airport cph = new Airport();
        
        Plane p1 = new Plane("Cessna", "Skyhawk");
        PassengerPlane p2 = new PassengerPlane("Boing", "737", 241);
        FreightPlane p3 = new FreightPlane("Antonov", "124", 110);
        PassengerPlane p4 = new PassengerPlane("Boing", "737", 241);
        PassengerPlane p5 = new PassengerPlane("Trash", "123", 99);
        p5.setId(2);
 
        cph.land(p1);
        cph.land(p2);
        cph.land(p3);
        cph.land(p4);
        System.out.println(cph);
 
        cph.land(p5);
        System.out.println(cph);
 
        cph.start(2);
        System.out.println(cph);
 
        cph.start(0);
        System.out.println(cph);
        cph.start(5);
        System.out.println(cph);
        cph.start(1);
        System.out.println(cph);
        cph.start(3);
        System.out.println(cph);
	}
}
