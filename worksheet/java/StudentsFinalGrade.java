package worksheet.java;

	import java.util.Scanner;

	public class StudentsFinalGrade {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        double exerciseGrade, examGrade;
	        double finalGrade;
	        double total = 0;
	        int count = 0;

	        while (true) {

	            System.out.print("Enter Exercise Grade: ");
	            exerciseGrade = sc.nextDouble();

	            System.out.print("Enter Exam Grade: ");
	            examGrade = sc.nextDouble();

	         
	            if (exerciseGrade == -1 || examGrade == -1) {
	                break;
	            }

	           
	            if (exerciseGrade < 0 || exerciseGrade > 10 || 
	                examGrade < 0 || examGrade > 10) {

	                System.out.println("Invalid grades. Please enter values between 0 and 10.");
	                continue;
	            }

	           
	            if (exerciseGrade >= 5 && examGrade >= 5) {
	                finalGrade = (exerciseGrade * 0.30) + (examGrade * 0.70);
	            } else {
	                if (exerciseGrade < examGrade) {
	                    finalGrade = exerciseGrade;
	                } else {
	                    finalGrade = examGrade;
	                }
	            }

	            System.out.println("Final Grade: " + finalGrade);

	            total = total + finalGrade;
	            count++;
	        }

	        
	        if (count > 0) {
	            double average = total / count;
	            System.out.println("Average Grade of all students: " + average);
	        } else {
	            System.out.println("No student data entered.");
	        }

	        sc.close();
	    }
	}


