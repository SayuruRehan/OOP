package Practicals.Practical_2;

import java.util.*;

public class Ex5 {
    public static void main(String args[]){
        EvenOddNumber o1 = new EvenOddNumber();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int var = sc.nextInt();

        boolean result = o1.findEvenOrOdd(var);

        if(result){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}
