import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 = ");
        int no1 = sc.nextInt();
        System.out.println("Enter number 2 = ");
        int no2 = sc.nextInt();
        System.out.println("Enter number 3 = ");
        int no3 = sc.nextInt();

        int largest;

        if(no1 > no2 && no1 > no3){
            largest = no1;
        }
        else if(no2 > no1 && no2 > no3){
            largest = no2;
        }
        else{
            largest = no3;
        }

        System.out.println("Largest number is: " + largest);
    }
}
