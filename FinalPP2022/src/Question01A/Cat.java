package Question01A;

public class Cat extends Pet {


	@Override
	public void feed() {
		// TODO Auto-generated method stub
		
		System.out.println("Feed cat");
		setter(getter() + 5);

	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		
		System.out.println("Clean cat");
		setter(getter() + 10);

	}

	@Override
	public void cuddle() {
		// TODO Auto-generated method stub
		
		System.out.println("Cuddle cat");
		setter(getter() + 15);

	}

	@Override
	public void GetTotalPoints() {
		// TODO Auto-generated method stub
		
		System.out.println("Total points: " + getter());

	}

}
