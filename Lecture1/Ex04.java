/*
Program to let user to check the given letter is a vowel letter
A, E, I, O, U
*/

import java.util.Scanner;
class Ex04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        char letter= scanner.next().charAt(0);

        if (letter == 'A'){
            System.out.println("Vowel");
        } else if (letter == 'E'){
            System.out.println("Vowel");
        } else if (letter == 'I'){
            System.out.println("Vowel");
        } else if (letter == 'O'){
            System.out.println("Vowel");
        } else if (letter == 'U'){
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
