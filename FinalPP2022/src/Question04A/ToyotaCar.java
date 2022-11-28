package Question04A;

public class ToyotaCar implements Car {
	
	CarAirBag airBag;

	public ToyotaCar(CarAirBag airBag) {
		// TODO Auto-generated constructor stub
		super();
		this.airBag = airBag;
	}

	@Override
	public void assembleLight() {
		// TODO Auto-generated method stub
		System.out.println("Assembling for Toyota");
		airBag.airBagLightIndicator();

	}
	

	@Override
	public void assembleMotionSensor() {
		// TODO Auto-generated method stub
		System.out.println("Assembling for Toyota");
		airBag.airBagMotionDetection();

	}

}
