package day10_string;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String full_name = input.nextLine();  // Cydeo School + Enter

        System.out.println("Enter your building number:");
        String buildingNumber = input.next(); // 7925A

        input.nextLine(); // to clear the scanner

        System.out.println("Enter your Street name: ");
        String streetName = input.nextLine(); // Jones Branch Dr + Enter

        System.out.println("Enter your city name:");
        String cityName = input.nextLine(); // McLean + Enter

        System.out.println("Enter your state name:");
        String stateName = input.nextLine();

        System.out.println("Enter your zip code:");
        String zip = input.next();

        //-----------------------------------------

        System.out.println("Your shipping address is:");
        System.out.println("\t" + full_name);
        System.out.println("\t" + buildingNumber+" "+streetName);
        System.out.println("\t" + cityName + ", " + stateName + " " +zip);

        input.close();


    }


}
