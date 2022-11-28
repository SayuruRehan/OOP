package q4b_2018;

public class Oven{

	private String name;
	
	Oven(String name) {
		
		this.name = name;
	}

	public void On() {
		System.out.println(name + "Oven is ON");
	}
	
	public void Off() {
		System.out.println(name + "Oven is OFF");
	}
}
