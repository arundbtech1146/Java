package Day3;


	import java.util.Scanner;

	public class PrintOddNumbers {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the value of n: ");
	        int n = scanner.nextInt();

	        System.out.println("Odd numbers from 1 to " + n + ":");
	        for (int i = 1; i <= n; i++) {
	            if (i % 2 != 0) {
	                System.out.println(i);
	            }
	        }

	        scanner.close();
	    }
	}


