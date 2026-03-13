package practice_java;
import java.util.Scanner;

public class Simpleifelse {
		public static void main(String[] args){
		boolean seatAvailable = false; 
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter the Seat Number : ");
		String SeatNumber = input.next(); 
		if(seatAvailable){ 
		System.out.println("Your have booked the seat number : "+SeatNumber);                                                                                }
	    else { 
		System.out.println("Seat Number "+SeatNumber+" is already booked");
		}
		input.close();
		}
}
