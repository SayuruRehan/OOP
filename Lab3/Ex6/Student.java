package Lab3;

public class Student extends Person{
    String studentId;

    public Student(String newName, String newAddress, String newStudentId){
        super(newName, newAddress);
        studentId = newStudentId;
    }

    void showDetails(){
        super.showDetails();
        System.out.println("Student ID: " + studentId);
    }
}