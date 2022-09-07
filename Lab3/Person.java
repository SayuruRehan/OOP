package Lab3;

public class Person {
    String name, address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    void showDetails(){
        System.out.println("Name: " + name + "\nAddress: " + address);
    }
}
