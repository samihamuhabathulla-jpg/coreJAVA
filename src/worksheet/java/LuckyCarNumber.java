package worksheet.java;

	import java.util.Scanner;
	public class LuckyCarNumber {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int carNo;
	        int sum = 0;

	        System.out.print("Enter the car no: ");
	        carNo = sc.nextInt();

	        if (carNo >= 1000 && carNo <= 9999) {

	            int temp = carNo;

	            while (temp != 0) {
	                int digit = temp % 10;
	                sum = sum + digit;
	                temp = temp / 10;
	            }

	            if (sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0) {
	                System.out.println("Lucky Number");
	            } else {
	                System.out.println("Sorry it’s not my lucky number");
	            }

	        } else {
	            System.out.println(carNo + " is not a valid car number");
	        }

	        sc.close();
	    }
	}


