package practice_Functions;

	import java.util.Scanner;
	public class VoteEligibility {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your age : ");
			int age = sc.nextInt();
		    boolean ans = vote(age);
		    if(ans) {
		    	System.out.println("You are eligible for voting");
		    }
		    else {
		    	System.out.println("You are not eligible for voting");
		    }
			
		}
		public static boolean vote(int a) {
			if(a>=18) {
				return true;
			}
			return false;
		}

	}


