package Question04A;

public class NissanCar implements Car {
	
	CarAirBag airBag;

	public NissanCar(CarAirBag airBag) {
		// TODO Auto-generated constructor stub
		super();
		this.airBag = airBag;
	}

	@Override
	public void assembleLight() {
		// TODO Auto-generated method stub
		System.out.println("Assembling for nissan");
		airBag.airBagLightIndicator();

	}

	@Override
	public void assembleMotionSensor() {
		// TODO Auto-generated method stub
		System.out.println("Assembling for nissan");
		airBag.airBagMotionDetection();

	}

}
