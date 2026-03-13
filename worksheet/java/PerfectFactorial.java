package worksheet.java;
	import java.util.Scanner;
    public class PerfectFactorial {
        public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        long number;
	        long fact = 1;
	        int i = 1;

	        System.out.print("Enter the number: ");
	        number = sc.nextLong();

	        if (number <= 0) {

	            System.out.println("Invalid Input");

	        } else {

	            while (fact < number) {
	                i++;
	                fact = fact * i;
	            }

	            if (fact == number) {
	                System.out.println(i);
	            } else {
	                System.out.println("Sorry. The given number is not a perfect factorial");
	            }
	        }

	        sc.close();
	    }
	}


