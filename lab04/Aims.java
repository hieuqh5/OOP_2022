
public class Aims {
    
	public static void main(String[] args) {
		//Order 1
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
	    anOrder.printDate();
	    anOrder.printList();
	    
	    //Order 2 
	    Order anOrder2 = new Order();
	    DigitalVideoDisc dvd4 = new DigitalVideoDisc("Fantastic Beasts and where to find them");
	    anOrder2.addDigitalVideoDisc(dvd4);
	    DigitalVideoDisc dvd5 = new DigitalVideoDisc("Sonic the hedgehog 2", "Animation", "Jeff Flower");
	    anOrder2.addDigitalVideoDisc(dvd5);
	    DigitalVideoDisc dvd6 = new DigitalVideoDisc("Morbius", "Sci-fi");
	    anOrder2.addDigitalVideoDisc(dvd6);
	    DigitalVideoDisc dvd7 = new DigitalVideoDisc("The Dark Knight", "Sci-fi", "Christopher Nolan", 152, 10.5f);
	    anOrder2.addDigitalVideoDisc(dvd7);
	    anOrder2.printList();
	    
	    
	}
}
