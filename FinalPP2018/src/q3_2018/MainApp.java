package q3_2018;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student = new Student(1, "DW");
		
		try {
			student.input();
		} catch (Exception e) {
			// TODO: handle exception
		
			System.out.println("Enter valid mark: ");
		}
		
		float average = student.getAverage();
		System.out.println("Average: " + average);
	}

}
