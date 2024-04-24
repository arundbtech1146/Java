package Day1;
import java.util.Scanner;


public class calculatorifelse {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.println("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        System.out.println("Enter an operator (+, -, *, /): ");
	        char operator = scanner.next().charAt(0);

	        double result = 0;

	        if (operator == '+') {
	            result = num1 + num2;
	        } else if (operator == '-') {
	            result = num1 - num2;
	        } else if (operator == '*') {
	            result = num1 * num2;
	        } else if (operator == '/') {
	            if (num2 != 0) {
	                result = num1 / num2;
	            } else {
	                System.out.println("Error: Cannot divide by zero");
	                System.exit(0);
	            }
	        } else {
	            System.out.println("Invalid operator");
	            System.exit(0);
	        }

	        System.out.println("Result: " + result);
	        scanner.close();
	    }
	}



