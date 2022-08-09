import java.util.Scanner;

class Ex05a {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int count = scanner.nextInt();
     
        for (int x = 1; x <= count; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y + ", ");
            }
            System.out.println();
        }
        System.out.println("Outside the for loop");
    }
}
