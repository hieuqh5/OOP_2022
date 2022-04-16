
public class Aims {
    
	public static void main(String[] args) {
		Order anOrder = new Order();
	    DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
	    dvd1.setCategory("Animation");
	    dvd1.setCost(19.95f);
	    dvd1.setDirector("Roger Allers");
	    dvd1.setLength(87);
	    
	    anOrder.addDigitalVideoDisc(dvd1);
	    
	    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
	    dvd2.setCategory("Science Fiction");
	    dvd2.setCost(24.95f);
	    dvd2.setDirector("George Lucas");
	    dvd2.setLength(124);
	    
	    anOrder.addDigitalVideoDisc(dvd2);
	    
	    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);
	    
	    anOrder.addDigitalVideoDisc(dvd3);
	    
	    System.out.println("Total Cost is: " + anOrder.totalCost());
	    
	    anOrder.removeDigitalVideoDisc(dvd3);
	    System.out.println("Total Cost is: " + anOrder.totalCost());
	    
	    
	}
}
