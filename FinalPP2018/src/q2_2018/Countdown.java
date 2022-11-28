package q2_2018;

public class Countdown extends Thread {
	public void run() {
		for(int i=1; i <= 10; i++) {
			System.out.println(i);
			try {
				Countdown.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
