package worksheet.java;

import java.util.*;

public class AsciiSort {
	    public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string: ");
			String str=sc.nextLine();
			char[] arr=str.toCharArray();
			Arrays.sort(arr);
			System.out.println(arr);
		}

	}


