package Question01A;

public abstract class Pet implements PointAllocater {
	
	private double point;

	@Override
	public void setter(double points) {
		// TODO Auto-generated method stub
		
		this.point = points;

	}

	@Override
	public double getter() {
		// TODO Auto-generated method stub

		return this.point;
	}
	
	public abstract void feed();
	public abstract void clean();
	public abstract void cuddle();
	public abstract void GetTotalPoints();
	

}
