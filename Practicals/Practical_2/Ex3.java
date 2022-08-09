package Practicals.Practical_2;
import java.util.Scanner;

public class Ex3 {
    public static void main(String args[]){
        int l, h, w, v;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        l = sc.nextInt();

        System.out.print("Enter height: ");
        h = sc.nextInt();

        System.out.print("Enter width: ");
        w = sc.nextInt();

        v = l * h * w;

        System.out.println("Volume: " + v);
    }
}
