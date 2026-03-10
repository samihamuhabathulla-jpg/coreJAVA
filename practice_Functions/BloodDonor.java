package practice_Functions;
import java.util.Scanner;
public class BloodDonor {
	

	    static void checkEligibility(int age, int weight) {

	        if (age > 18 && age <= 55 && weight > 45) {
	            System.out.println("Eligible to donate blood");
	        } else {
	            System.out.println("Not eligible to donate blood");
	        }
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Age: ");
	        int age = sc.nextInt();

	        System.out.print("Enter Weight: ");
	        int weight = sc.nextInt();

	        checkEligibility(age, weight);  

	        sc.close();
	    }
	}


