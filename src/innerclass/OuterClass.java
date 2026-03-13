package innerclass;
 class OuterClasses {
	int age =18;
	public void checkAge() {
		System.out.println("In CheckAge()Method call");
	}
	class InnerClass{
		public void show() {
			System.out.println("In show()method call of inner class");
	
		}
	}

}
public class OuterClass {

	public static void main(String[] args) {
		OuterClasses outer = new OuterClasses();
		System.out.println("OuterClass method call");
		outer.checkAge();
		OuterClasses.InnerClass inner = outer.new InnerClass();
		System.out.println("InnerClass method call");
		inner.show();
	}

}

