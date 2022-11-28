package q4b_2018;

public class GarageGate {

	private String description;
	
	public GarageGate(String description) {
		this.description = description;
	}
	
	public void Open() {
		System.out.println(description + "Gate is open");
	}
	
	public void Close () {
		System.out.println(description + "Gate is closed");
	}
}
