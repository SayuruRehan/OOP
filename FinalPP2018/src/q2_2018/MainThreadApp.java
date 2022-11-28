package q2_2018;

public class MainThreadApp {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		Thread countdown = new Countdown();
		
		Thread calcsum1 = new Thread(new CalcSum());
		Thread calcsum2 = new Thread(new CalcSum());
	
		countdown.start();
		countdown.join();
		
		calcsum1.setName("Black");
		calcsum2.setName("White");
		
		calcsum1.start();
		calcsum2.start();
	}

}
