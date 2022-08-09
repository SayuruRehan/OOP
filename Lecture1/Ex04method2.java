/*
Program to let user to check the given letter is a vowel letter
A, E, I, O, U
*/

import java.util.Scanner;

class Ex04method2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        String letter = scanner.next();

        if((letter.equals("A")) || (letter.equals("E")) || (letter.equals("I")) || (letter.equals("O")) || (letter.equals("U"))){
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
