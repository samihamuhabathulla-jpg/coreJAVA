package practice_Functions;
import java.util.Scanner;
public class OvertimePay {
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int hours;
	        int overtime;
	        int pay;

	        for (int i = 1; i <= 5; i++) {

	            System.out.print("Enter working hours of employee " + i + ": ");
	            hours = sc.nextInt();

	            if (hours > 40) {
	                overtime = hours - 40;
	                pay = overtime * 15;
	            } 
	            else {
	                pay = 0;
	            }

	            System.out.println("Overtime pay for employee " + i + " is: " + pay);
	        }

	        sc.close();
	    }
	}


