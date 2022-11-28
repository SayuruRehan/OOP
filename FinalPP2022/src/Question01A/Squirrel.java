package Question01A;

public class Squirrel extends Pet {
	
	private String command;
	
	public Squirrel(String command) {
		this.command = command;
	}


	@Override
	public void feed() {
		// TODO Auto-generated method stub
		
		System.out.println("Feed Squirrel");
		setter(getter() + 5);

	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		
		System.out.println("Clean Squirrel");
		setter(getter() + 10);

	}

	@Override
	public void cuddle() {
		// TODO Auto-generated method stub
		
		System.out.println("Cuddle Squirrel");
		setter(getter() + 15);

	}

	@Override
	public void GetTotalPoints() {
		// TODO Auto-generated method stub
		
		if(isCaught() == true) {
			setter(0);
		}
		else
			System.out.println("total points is: " + getter());

	}
	
	public boolean isCaught() {
		try {
			if(this.command.length() == 4 && this.command.equalsIgnoreCase("Run5")) {
				
				throw new CaughtException("caught");
			}
			else
				System.out.println("Not caught");
			
		} catch (CaughtException e) {
			// TODO: handle exception
			System.out.println(e);
			return true;
		}
		return false;
	}

}
