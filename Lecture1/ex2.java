import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.println("Enter width of the rectangle: ");
        double width = scanner.nextDouble();

        double perimeter = 2 * (length + width);

        System.out.println("Perimeter of the rectangle is: " + perimeter);
    }
}