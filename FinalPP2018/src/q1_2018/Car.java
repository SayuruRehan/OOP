package q1_2018;

public class Car extends Item {
	
	private String model;
	private String type;

	public Car(int no, String des, double price, String model, String type) {
		super(no, des, price);
		this.model = model;
		this.type = type;
		// TODO Auto-generated constructor stub

	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub
		super.Display();
		System.out.println("Item No: "+ this.itemNo);
		System.out.println("Description: "+ this.description);
		System.out.println("Unit Price: " + this.unitPrice);
		System.out.println("Model: "+ this.model);
		System.out.println("Type: " + this.type);
	}

}
