package q4b_2018;

public class GarageGateClose implements Command {

	GarageGate garageGate;
	
	public GarageGateClose(GarageGate garageGate) {
		this.garageGate = garageGate;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub

		garageGate.Close();
	}

}
