package practice_Functions;
import java.util.Scanner;
public class SalaryIncrement {
	    static void calculateIncrement(double salary, double rating) {

	        double newSalary;

	        if (salary <= 0 || rating < 1 || rating > 10) {
	            System.out.println("Invalid Input");
	            return;
	        }

	        if (rating >= 1 && rating <= 4) {
	            newSalary = salary + (salary * 0.10);
	        }
	        else if (rating > 4 && rating <= 7) {
	            newSalary = salary + (salary * 0.25);
	        }
	        else {
	            newSalary = salary + (salary * 0.30);
	        }

	        System.out.println((int)newSalary);
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the salary: ");
	        double salary = sc.nextDouble();

	        System.out.print("Enter the appraisal rating: ");
	        double rating = sc.nextDouble();

	        calculateIncrement(salary, rating);

	        sc.close();
	    }
	}


