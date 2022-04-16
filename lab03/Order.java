
public class Order {
    
	public static final int MAX_NUMBER_ORDERED = 10;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	
	private int quantity = 0;
	public int qtyOrdered() {
		return quantity;
	}
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(quantity <= MAX_NUMBER_ORDERED) {
		   itemsOrdered[quantity] = disc;
		   quantity++;
		   System.out.println("The disc " + disc.getTitle() + " has been added");
		}
		else {
			System.out.println("The number ordered is limited!");
		}
		
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int pos = 0;
		for(int i = 0; i < quantity; i++) {
			if(itemsOrdered[i] == disc) {
				pos = i;
			}
		}
		for(int j = pos; j < quantity; j++) {
			itemsOrdered[j] = itemsOrdered[j + 1];
		}
		--quantity;
		System.out.println("The disc " + disc.getTitle() + " has been removed!");
	}
	public float totalCost() {
		float total = 0;
		for(int i = 0; i < quantity; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}
		
}
