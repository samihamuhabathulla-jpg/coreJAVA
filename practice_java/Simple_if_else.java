package practice_java;

public class Simple_if_else {
	public static void main(String[]args) {
		boolean isMoving=true;
		int currentSpeed=10;
		if(isMoving) {
			currentSpeed--;
			System.out.println("The bicycle speed got reduced!");
		}
		else {
			System.out.println("The bicycle has already stopped!");
		}
	}

}
