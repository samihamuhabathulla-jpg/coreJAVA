package Practice_OOPS;

	abstract class Shape {

	    void draw() {
	        System.out.println("drawing..");
	    }

	    abstract void area();
	    abstract void perimeter();
	}

	class Rectangle extends Shape {

	    private int length, breadth;

	    Rectangle(int length, int breadth) {
	        this.length = length;
	        this.breadth = breadth;
	    }

	    void area() {
	        int area = length * breadth;
	        System.out.println("Area of Rectangle: " + area);
	    }

	    void perimeter() {
	        int perimeter = 2 * (length + breadth);
	        System.out.println("Perimeter of Rectangle: " + perimeter);
	    }
	}
	class Square extends Shape {

	    private int side;

	    Square(int side) {
	        this.side = side;
	    }

	    void area() {
	        System.out.println("Area of Square: " + (side * side));
	    }

	    void perimeter() {
	        System.out.println("Perimeter of Square: " + (4 * side));
	    }
	}
	class Circle extends Shape {

	    private int radius;

	    Circle(int radius) {
	        this.radius = radius;
	    }

	    void area() {
	        double area = 3.14 * radius * radius;
	        System.out.println("Area of Circle: " + area);
	    }

	    void perimeter() {
	        double perimeter = 2 * 3.14 * radius;
	        System.out.println("Perimeter of Circle: " + perimeter);
	    }
	}

	public class TestShape {

	    public static void main(String[] args) {

	        Shape s;

	        s = new Rectangle(3, 5);
	        s.area();
	        s.perimeter();

	        s = new Square(5);
	        s.area();
	        s.perimeter();

	        s = new Circle(4);
	        s.area();
	        s.perimeter();
	 
	    }
	}
	        
	    


