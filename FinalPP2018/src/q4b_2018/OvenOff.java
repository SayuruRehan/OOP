package q4b_2018;

public class OvenOff implements Command {

	Oven oven;
	
	public OvenOff(Oven oven) {
		this.oven = oven;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub

		oven.Off();
	}

}
