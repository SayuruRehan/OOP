package Practicals.Practical_2;

public class Ex1 {
    public static void main(String args[]) {
        int miles = 26;
        int yards = 385;
        double km;

        km = (miles * 1.609) + (yards * 0.0009144);

        System.out.println("Kilometers: " + km);
    }
}
