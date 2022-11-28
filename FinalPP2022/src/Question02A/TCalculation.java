package Question02A;

import java.util.ArrayList;

public class TCalculation <T extends Number> {

	ArrayList<T> numList = new ArrayList<>();
	
	public void append(T value) {
		numList.add(value);
	}
	
	public double average() {
		double total = 0;
		
		for(T value : numList) {
			total += value.doubleValue();
		}
		return total/numList.size();
	}
}
