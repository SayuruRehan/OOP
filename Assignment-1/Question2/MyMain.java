//S.R.Bopitiya - IT21470004 - Malabe - G8.1
//OOP Assignment 1 - Q2

public class MyMain {
  public static void main(String[] args) {
    RandNum rand1 = new RandNum();

    rand1.calculateValues();
    rand1.displayValues(rand1.getmin(), rand1.getmax(), rand1.getavg());
  }
}