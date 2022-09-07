import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        int i, num, count1 = 0, count2 = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        for(i = 0; i < 20; i++){
            num = input.nextInt();
            if(num % 2 == 0){
                count1++;
            }
            else{
                count2++;
            }
        }
        System.out.println("Number of even numbers: " + count1);
        System.out.println("Number of odd numbers: " + count2);

    }
}
