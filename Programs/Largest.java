package Day3;


	import java.util.Scanner;

	public class Largest {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter three numbers: ");
	        double num1 = scanner.nextDouble();
	        double num2 = scanner.nextDouble();
	        double num3 = scanner.nextDouble();

	        double largest;

	        if (num1 >= num2) {
	            if (num1 >= num3) {
	                largest = num1;
	            } else {
	                largest = num3;
	            }
	        } else {
	            if (num2 >= num3) {
	                largest = num2;
	            } else {
	                largest = num3;
	            }
	        }

	        System.out.println("Largest number is: " + largest);

	        scanner.close();
	    }
	}



