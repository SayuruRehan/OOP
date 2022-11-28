package q1_2018;

public class Book extends Item {
	private String Publisher;
	private String Category;
	private int pages;
	
	Book(int no, String des, double price, String publisher, String category, int pages) {
		super(no, des, price);
		this.itemNo = no;
		this.Publisher = publisher;
		this.Category = category;
		this.pages = pages;
	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("Item No: "+ this.itemNo);
		System.out.println("Description: "+ this.description);
		System.out.println("Unit Price: " + this.unitPrice);
		System.out.println("Publisher: "+ this.Publisher);
		System.out.println("Category: " + this.Category);
		System.out.println("Pages: "+ this.pages);
		
	}
	
	
	
}
