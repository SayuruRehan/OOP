import java.util.Scanner;

class Ex02{
    public static void main(String[] args){

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter number 1: ");
            int no1 = scanner.nextInt();

            System.out.println("Enter number 2: ");
            int no2 = scanner.nextInt();

            System.out.println("Enter number 3: ");
            int no3 = scanner.nextInt();

            int total = no1 + no2 + no3;

            System.out.println("The total = " + total);
        }
    }
}