package q4b_2018;

public class OvenOn implements Command {

	Oven oven;
	
	public OvenOn(Oven oven) {
		this.oven = oven;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub

		oven.On();
	}

}
