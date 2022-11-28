package q1_2018;

import java.util.*;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Item> itemList = new ArrayList<Item>();

		Item book1 = new Book(1, "Book1", 120.00, "Gunasena", "Children", 56);
		Item book2 = new Book(2, "Book2", 1200.00, "Sarasavi", "Novel", 380);
				
		itemList.add(book1);
		itemList.add(book2);
		
		Item car1 = new Car(3, "Brand New", 10000.00, "A", "C");
		Item car2 = new Car(4, "Used", 1204340.00, "B", "D");
				
		itemList.add(car1);
		itemList.add(car2);
		
		for(Item item:itemList) {
			item.Display();
		}
	}

}
