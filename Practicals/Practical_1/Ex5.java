package Practicals.Practical_1;

public class Ex5 {
    public static void main(String[] args){

        int rows = 5;
        int columns = 5;
        int i=1;
        int j;

        //represents the rows
        while(i <= rows){
            j=1;

            //represents the columns
            while(j <= columns){
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println("");
        }
    }
}
