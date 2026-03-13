package Java_String;
import java.util.Scanner;
public class MyTrimExample {
public static String myTrim(String s) {
	int start =0;
	int end =s.length()-1;
	
	while(start < s.length() && s.charAt(start)==' ') {
		start++;
	}
	while(end>=0 && s.charAt(end)==' ') {
		end--;
	}
	String result ="";
	for(int i =start;i<=end;i++) {
		result = result+s.charAt(i);
		}
	return result;
}
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String:");
	String input =sc.nextLine();
	
	String output =myTrim(input);
	System.out.println(output);
	sc.close();
}

}
