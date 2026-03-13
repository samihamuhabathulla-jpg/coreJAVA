package practice_java;
import java.util.Scanner;
public class ReadMoreInputs {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Movie ID : ");
			int mov_id = sc.nextInt();
			System.out.println("Enter Movie Name : ");
			sc.nextLine();
			String mov_name = sc.nextLine();
			System.out.println("Enter Movie Description : ");
			String mov_des = sc.nextLine();
			System.out.println("Enter Movie Language : ");
			String mov_lan = sc.next();
			System.out.println("Enter Movie Genre : ");
			String mov_genre = sc.next();
			System.out.println("Enter Movie Release date : ");
			String mov_rel = sc.next();
			System.out.println("Enter Movie Seat cost : ");
			sc.nextLine();
			float mov_cost = sc.nextFloat();
			System.out.println("ENTERED MOVIE DETAILS ARE");
			System.out.println("Movie ID : "+mov_id);
			System.out.println("Movie Name : "+mov_name);
			System.out.println("Movie Description : "+mov_des);
			System.out.println("Movie Language : "+mov_lan);
			System.out.println("Movie Genre : "+mov_genre);
			System.out.println("Movie Date : "+mov_rel); 
			System.out.println("Movie Seat Cost : "+mov_cost);
			
		}
	}


