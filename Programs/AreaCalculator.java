package Day4;


	import java.util.Scanner;

	public class AreaCalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Select shape to find area:");
	        System.out.println("1. Circle");
	        System.out.println("2. Rectangle");
	        System.out.println("3. Square");
	        System.out.println("4. Triangle");
	        int choice = scanner.nextInt();

	        switch (choice) {
	            case 1:
	                System.out.println("Enter radius of circle:");
	                double radius = scanner.nextDouble();
	                System.out.println("Area of circle: " + calculateCircleArea(radius));
	                break;
	            case 2:
	                System.out.println("Enter length and breadth of rectangle:");
	                double length = scanner.nextDouble();
	                double breadth = scanner.nextDouble();
	                System.out.println("Area of rectangle: " + calculateRectangleArea(length, breadth));
	                break;
	            case 3:
	                System.out.println("Enter side length of square:");
	                double side = scanner.nextDouble();
	                System.out.println("Area of square: " + calculateSquareArea(side));
	                break;
	            case 4:
	                System.out.println("Enter base and height of triangle:");
	                double base = scanner.nextDouble();
	                double height = scanner.nextDouble();
	                System.out.println("Area of triangle: " + calculateTriangleArea(base, height));
	                break;
	            default:
	                System.out.println("Invalid choice!");
	        }

	        scanner.close();
	    }

	    // Method to calculate area of a circle
	    public static double calculateCircleArea(double radius) {
	        return Math.PI * radius * radius;
	    }

	    // Method to calculate area of a rectangle
	    public static double calculateRectangleArea(double length, double breadth) {
	        return length * breadth;
	    }

	    // Method to calculate area of a square
	    public static double calculateSquareArea(double side) {
	        return side * side;
	    }

	    // Method to calculate area of a triangle
	    public static double calculateTriangleArea(double base, double height) {
	        return 0.5 * base * height;
	    }
	}


