package q2_2018;

public class CalcSum implements Runnable {

	private int total;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

		synchronized (this) {
			for(int i = 0; i < 100000; i++) {
				total += i;
			}
			System.out.println("Total: " + this.total + "Thread " + Thread.currentThread());
			
		}
	}

}
