package Day1;

	import java.util.Scanner;

	public class MiniCalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        char choice=0;

	        do {
	            System.out.println("Enter the first number: ");
	            double num1 = scanner.nextDouble();
	            System.out.println("Enter the second number: ");
	            double num2 = scanner.nextDouble();

	            System.out.println("Choose an operation (+, -, *, /): ");
	            char operator = scanner.next().charAt(0);

	            double result;

	            switch (operator) {
	                case '+':
	                    result = num1 + num2;
	                    break;
	                case '-':
	                    result = num1 - num2;
	                    break;
	                case '*':
	                    result = num1 * num2;
	                    break;
	                case '/':
	                    if (num2 == 0) {
	                        System.out.println("Error: Cannot divide by zero");
	                        continue;
	                    }
	                    result = num1 / num2;
	                    break;
	                default:
	                    System.out.println("Invalid operator");
	                    continue;
	            }

	            System.out.println("Result: " + result);
	            System.out.println("Do you want to perform another operation? (y/n): ");
	            choice = scanner.next().charAt(0);

	        } while (choice == 'y' || choice == 'Y');

	        scanner.close();
	    }
	
	}
	

