/*Program to let user to enter a number. Then display either odd or even (if condition)
no%2 == 0 => even
no%2 != 0 => odd*/

import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        int no, ans;

        Scanner ac = new Scanner(System.in);

        System.out.println("Enter a number: ");
        no = ac.nextInt();

        ans = no % 2;

        if (ans == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
