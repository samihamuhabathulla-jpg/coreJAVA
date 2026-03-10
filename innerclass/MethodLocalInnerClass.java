package innerclass;


class Outer{
	int value=56;
	public void outerClassMethod() {
		System.out.println("Inside the Method of Outer class");
		class Inner{
			public void InnerClassMethod() {
				System.out.println("Inside the Method of Inner class");
				System.out.println("Value:"+value);
			}
		}
		Inner inner =new Inner();
		inner.InnerClassMethod();
	}
	
}
public class MethodLocalInnerClass {
	public static void main(String[]args) {
		Outer outer=new Outer();
		outer.outerClassMethod();
	}

}
