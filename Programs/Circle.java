package Day4;


	public class Circle {
	    // Instance variables
	    private double radius;

	    // Parameterized constructor
	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    // Method to calculate area of circle
	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }

	    // Method to calculate circumference of circle
	    public double calculateCircumference() {
	        return 2 * Math.PI * radius;
	    }

	    public static void main(String[] args) {
	        // Creating an object of Circle class with radius 5
	        Circle circle = new Circle(5);

	        // Calculating and displaying area of circle
	        System.out.println("Area of circle: " + circle.calculateArea());

	        // Calculating and displaying circumference of circle
	        System.out.println("Circumference of circle: " + circle.calculateCircumference());
	    }
	}



