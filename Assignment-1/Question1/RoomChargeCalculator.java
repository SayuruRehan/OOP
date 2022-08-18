//S.R.Bopitiya - IT21470004 - Malabe - G8.1
//OOP Assignment 1 - Q1

import java.util.Scanner;

public class RoomChargeCalculator {

  public static void main(String args[]) {

    //variables
    int roomType;
    char extra, reqBalcony, reqParking, reqTV, reqKitchen, reqWifi, reqGarden, reqAC;
    boolean balcony, parking, tv, kitchen, wifi, garden, ac;

    Scanner sc = new Scanner(System.in);

    System.out.println("\n Room Charge Calculator");
    System.out.println("------------------------");
    System.out.println("------------------------");
    System.out.println("Types of rooms available");
    System.out.println("------------------------");
    System.out.println("1-Deluxe Double Room");
    System.out.println("2-Standard Family Room");
    System.out.println("3-Standard Single Room");
    System.out.println("4-Quit");

    System.out.print("\nEnter your choice (1-4): ");  //user input
    roomType = sc.nextInt();

    // 1-Deluxe Double Room
    if (roomType == 1) {
      System.out.println("Fixed Fee = 5000\n");
      System.out.print("Do you require extra services? (Y/N): ");
      extra = sc.next().charAt(0);

      if (extra == 'y' || extra == 'Y') {
        System.out.println("Balcony\t= 500");
        System.out.println("Parking\t= 200");
        System.out.println("TV\t\t= 200");
        System.out.println("Kitchen\t= 1000");
        System.out.println("WiFi\t= 100");

        System.out.println("-------------------");

        // Balcony requirement user input
        System.out.print("Do you require Balcony? (Y/N): ");
        reqBalcony = sc.next().charAt(0);
        balcony = booleanConverter(reqBalcony);

        // Parking requirement user input
        System.out.print("Do you require Parking? (Y/N): ");
        reqParking = sc.next().charAt(0);
        parking = booleanConverter(reqParking);

        // TV requirement user input
        System.out.print("Do you require TV? (Y/N): ");
        reqTV = sc.next().charAt(0);
        tv = booleanConverter(reqTV);

        // Kitchen requirement user input
        System.out.print("Do you require Kitchen? (Y/N): ");
        reqKitchen = sc.next().charAt(0);
        kitchen = booleanConverter(reqKitchen);

        // WiFi requirement user input
        System.out.print("Do you require WiFi? (Y/N): ");
        reqWifi = sc.next().charAt(0);
        wifi = booleanConverter(reqWifi);

        System.out.println("---------------------------------");
        System.out.print("Your Total Bill = " + getChargeDeluxeDouble(balcony, parking, tv, kitchen, wifi));
      } else if (extra == 'n' || extra == 'N') {
        System.out.print("Your Total Bill = " + getChargeDeluxeDouble(false, false, false, false, false));
      } else {
        System.out.println("Error! Invalid Input!");
      }
    }

    // 2-Standard Family Room
    if (roomType == 2) {
      System.out.println("Fixed Fee = 3000\n");
      System.out.print("Do you require extra services? (Y/N): ");
      extra = sc.next().charAt(0);

      if (extra == 'y' || extra == 'Y') {
        System.out.println("Parking\t= 200");
        System.out.println("Kitchen\t= 500");
        System.out.println("Garden\t= 200");

        System.out.println("----------------------------------");

        // Parking requirement user input
        System.out.print("Do you require Parking? (Y/N): ");
        reqParking = sc.next().charAt(0);
        parking = booleanConverter(reqParking);

        // Kitchen requirement user input
        System.out.print("Do you require Kitchen? (Y/N): ");
        reqKitchen = sc.next().charAt(0);
        kitchen = booleanConverter(reqKitchen);

        // Garden requirement user input
        System.out.print("Do you require Garden? (Y/N): ");
        reqGarden = sc.next().charAt(0);
        garden = booleanConverter(reqGarden);

        System.out.println("---------------------------------");
        System.out.print("Your Total Bill = " + getChargeStandardFamily(parking, kitchen, garden));
      } else if (extra == 'n' || extra == 'N') {
        System.out.print("Your Total Bill = " + getChargeStandardFamily(false, false, false));
      } else {
        System.out.println("Error! Invalid Input!");
      }
    }

    // 3-Standard Single Room
    if (roomType == 3) {
      System.out.println("Fixed Fee = 2000\n");
      System.out.print("Do you require extra services? (Y/N): ");
      extra = sc.next().charAt(0);

      if (extra == 'y' || extra == 'Y') {
        System.out.println("Parking\t= 200");
        System.out.println("AC\t= 500");
        System.out.println("WiFi\t= 200");

        System.out.println("-------------------");

        // Parking requirement user input
        System.out.print("Do you require Parking? (Y/N): ");
        reqParking = sc.next().charAt(0);
        parking = booleanConverter(reqParking);

        // AC requirement user input
        System.out.print("Do you require A/C? (Y/N): ");
        reqAC = sc.next().charAt(0);
        ac = booleanConverter(reqAC);

        // Wifi requirement user input
        System.out.print("Do you require WiFi? (Y/N): ");
        reqWifi = sc.next().charAt(0);
        wifi = booleanConverter(reqWifi);

        System.out.println("---------------------------------");
        System.out.print("Your Total Bill = " + getChargeStandardSingle(parking, ac, wifi));
      } else if (extra == 'n' || extra == 'N') {
        System.out.print("Your Total Bill = " + getChargeStandardSingle(false, false, false));
      } else {
        System.out.println("Error! Invalid Input!");
      }
      // Exit
      if(roomType == 4) {
      System.out.println("Thank you! We hope you enjoy your stay!");
      }  

      // Error message
      else {
        System.out.println("Error! Invalid Input!!!");
        System.out.println("Please try again");
      }
      System.out.println("---------------------------------");
      System.out.println("---------------------------------");
    }
  } // end if condition

  // booleanConverter
  public static boolean booleanConverter(char req) {
    boolean condition;
    if (req == 'y' || req == 'Y') {
      condition = true;
    } else {
      condition = false;
    }
    return condition;
  }

  // Implementing getChargeDeluxeDouble
  public static int getChargeDeluxeDouble(boolean Balcony, boolean Parking, boolean TV, boolean Kitchen, boolean WiFi) {
    int value = 5000; // fixed fee
    // extra services
    if (Balcony == true) {
      value = value + 500;
    }
    if (Parking == true) {
      value = value + 200;
    }
    if (TV == true) {
      value = value + 200;
    }
    if (Kitchen == true) {
      value = value + 1000;
    }
    if (WiFi == true) {
      value = value + 100;
    }

    return value;
  }

  // Implementing getChargeStandardFamily
  public static int getChargeStandardFamily(boolean Parking, boolean Kitchen, boolean Garden) {
    int value = 3000; // fixed fee
    // extra services
    if (Parking == true) {
      value = value + 200;
    }
    if (Kitchen == true) {
      value = value + 500;
    }
    if (Garden == true) {
      value = value + 200;
    }

    return value;
  }

  // Implementing getChargeStandardSingle
  public static int getChargeStandardSingle(boolean Parking, boolean AC, boolean WiFi) {
    int value = 2000; // fixed fee
    // extra services
    if (Parking == true) {
      value = value + 200;
    }
    if (AC == true) {
      value = value + 500;
    }
    if (WiFi == true) {
      value = value + 100;
    }

    return value;
  }
}