package Lab3;

public class Test {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
 
        s1.setName("John");
        s1.setDitNo("IT43");
        s1.setAddress("Colombo");

        s2.setName("Mary");
        s2.setDitNo("IT44");
        s2.setAddress("Kandy");

        //System.out.println("Name: " + s1.getName() + "\nDitno: " + s1.getDitNo() + "\nAddress: " + s1.getAddress());
        //System.out.println("Name: " + s2.getName() + "\nDitno: " + s2.getDitNo() + "\nAddress: " + s2.getAddress());

        System.out.println(s1.getDetails());
        System.out.println(s2.getDetails());
    }
}
