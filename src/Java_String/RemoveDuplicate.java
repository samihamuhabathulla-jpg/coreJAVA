package Java_String;
import java.util.Scanner;
public class RemoveDuplicate {
    public static void removeDuplicate(String str) {
    	boolean seen []= new boolean[256];
    	String result="";
    	
    	for(int i=0;i<str.length();i++) {
    		char ch = str.charAt(i);
    		
    		if(seen[ch]==false) {
    			result=result+ch;
    			seen[ch]=true;
    		}
    	}
    	System.out.println(result);
    }
    public static void main(String[]args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the String:");
    	String input = sc.nextLine();
    	
    	removeDuplicate(input);
    	
    	sc.close();
    }
}
   