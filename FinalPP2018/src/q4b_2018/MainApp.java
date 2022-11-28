package q4b_2018;

public class MainApp {

	public static void main(String[] args) {
		
		MobileUI mobileUI = new MobileUI();
		
		Oven mainOven = new Oven("Main oven");
		GarageGate garageGate = new GarageGate("Garage Gate");
		
		OvenOn onMainOven = new OvenOn(mainOven);
		OvenOff offMainOven = new OvenOff(mainOven);
		
		GarageGateOpen openGarageGate = new GarageGateOpen(garageGate);
		GarageGateClose closeGarageGate = new GarageGateClose(garageGate);
		
		mobileUI.setCommand(0, closeGarageGate);
		mobileUI.setCommand(1, openGarageGate);
		mobileUI.setCommand(2, onMainOven);
		mobileUI.setCommand(3, offMainOven);
		
		mobileUI.commandPressed(2);
		mobileUI.commandPressed(3);
		mobileUI.commandPressed(0);
		mobileUI.commandPressed(1);
	}

}
