package Practicals.Practical_2;
import java.io.*;

public class Ex4 {
    public static void main(String args[]) throws IOException{

        int l,h,w,v;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter length: ");
        l = Integer.parseInt(reader.readLine());

        System.out.println("Enter height: ");
        h = Integer.parseInt(reader.readLine());

        System.out.println("Enter width: ");
        w = Integer.parseInt(reader.readLine());

        v = l * h * w;
        System.out.println("Volume: " + v);

    }
}
