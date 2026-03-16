package java_Array;
import java.util.*;
public class VectorDemo {
	public static void main(String[]args) {
		Vector<String>v=new Vector<String>();
		System.out.println("Size of the vector is"+v.size());
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		System.out.println("Elements in the Vector"+v);
		System.out.println("Size of Vector is"+v.size());
		System.out.println("capacity of the vector is "+v.capacity());
		v.remove(3);
		System.out.println("Elements after deletion "+v);
	}


		
	}
	
 