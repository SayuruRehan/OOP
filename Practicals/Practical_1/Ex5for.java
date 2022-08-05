package Practicals.Practical_1;

public class Ex5for{
    public static void main(String[] args){
        //i-rows, j-columns
        int i,j;
        int rows = 6;

        //outer loop represents the rows
        for(i=0; i<rows; i++){
        
            //inner for loop represents the spaces
            for(j = rows-i; j > 1; j--){

                //prints the spaces between the stars
                System.out.print(" ");
            }
            //inner for loop represents the columns
            for(j=0; j<=i; j++){

                //prints stars
                System.out.print("* ");
            }
        }
    }
}