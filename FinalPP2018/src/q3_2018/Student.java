package q3_2018;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Student {
	private int id;
	private String names;
	private float marks[];
	private int noOfSubjects;
	Scanner sc = new Scanner(System.in);
	
	Student(int id, String names) {
		super();
		this.id = id;
		this.names = names;
	}
	
	public float inputMarks(int index) throws MarksException{
		System.out.println("Enter marks: ");
		int mark = sc.nextInt();
		
		if(mark < 0 || mark > 100) {
			throw new MarksException(mark);
		}
		
		else 
			return mark;
	}
	
	public void input() throws MarksException {
		System.out.println("Enter number of subjects: ");
		try {
			this.noOfSubjects = sc.nextInt();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			
		}
		
		marks = new float[noOfSubjects];
		
		for (int i = 0; i < this.noOfSubjects; i++) {
			float mark = inputMarks(i);
			this.marks[i] = mark;
		}
	}
	
	public float getAverage() {
		float total = (float) 0.0;
		float avg = (float) 0.0;
		
		for(float mark:marks) {
			total += mark;
		}
		try {
			avg = total / noOfSubjects;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		return avg;
	}
	
	
}
