package Question02A;

public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TCalculation<Integer> integer = new TCalculation<>();
		integer.append(12);
		integer.append(1);
		integer.append(20);
		
		TCalculation<Double> doub = new TCalculation<>();
		doub.append(13.0);
		doub.append(11.5);
		doub.append(22.4);
		
		System.out.println("Average = " + integer.average());
		System.out.println("Average = " + doub.average());
	}

}
