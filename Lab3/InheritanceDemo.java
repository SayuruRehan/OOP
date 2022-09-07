package Lab3;

public class InheritanceDemo {

    public static void main(String[] args){
        Person p1 = new Person("John", "123 Main St.");
        Student s1 = new Student("Mary", "456 Main St.", "IT345");


        p1.showDetails();        
        s1.showDetails();
    }

}
