import java.util.*;

class Main {
    public static void main(String[] args) {
        int age;
        String name;

        Scanner ac = new Scanner(System.in);

        System.out.println("Enter your name: ");
        name = ac.nextLine();

        System.out.println("Enter your age: ");
        age = ac.nextInt();

        System.out.println("Hello " + name + " you are " + age + " years old.");
    }
}
