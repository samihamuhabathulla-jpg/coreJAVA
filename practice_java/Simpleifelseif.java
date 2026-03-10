package practice_java;

import java.util.Scanner;

public class Simpleifelseif {
    public static void main(String[] args) {

        String seattype;

        System.out.println(
            "Type of seats Available\n" +
            "REGULAR\n" +
            "PREMIUM\n" +
            "EXECUTIVE\n" +
            "VIP\n" +
            "Choose any one of the option:"
        );

        Scanner input = new Scanner(System.in);
        seattype = input.next();

        if (seattype.equalsIgnoreCase("REGULAR")) {
            System.out.println("You have selected Regular Seat and cost is Rs.80");
        } 
        else if (seattype.equalsIgnoreCase("PREMIUM")) {
            System.out.println("You have selected Premium Seat and cost is Rs.100");
        }
        else if (seattype.equalsIgnoreCase("EXECUTIVE")) {
            System.out.println("You have selected Executive Seat and cost is Rs.120");
        } 
        else if (seattype.equalsIgnoreCase("VIP")) {
            System.out.println("You have selected VIP Seat and cost is Rs.150");
        } 
        else {
            System.out.println("You have not selected any valid seat type");
        }

        input.close();
    }
}

