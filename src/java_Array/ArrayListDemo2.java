package java_Array;
import java.util.*;
public class ArrayListDemo2 {
	public static void main(String[]args) {
		ArrayList<Integer>Arr=new ArrayList<Integer>();
		System.out.println("InitialSize of Array List is"+Arr.size());
		Arr.add(1);
		Arr.add(2);
		Arr.add(3);
		Arr.add(4);
		System.out.println("After insert the Size of Array List"+Arr.size());
		System.out.println("Contents of ArrayList"+Arr);
		Integer ia[]=new Integer[Arr.size()];
		ia=Arr.toArray(ia);
		int sum =0;
		for(int i:ia) {
			sum+=i;
		}
		System.out.println("Sum value is"+sum);
		
	}

}
